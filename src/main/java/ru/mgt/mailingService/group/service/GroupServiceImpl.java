package ru.mgt.mailingService.group.service;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.streams.KeyValue;
import org.springframework.stereotype.Service;
import ru.mgt.icp.proto.group.TabGroup;
import ru.mgt.icp.proto.shared.User;
import ru.mgt.icp.shared.kafka.store.user.UserStore;
import ru.mgt.icp.shared.proto.Protos;
import ru.mgt.icp.shared.kafka.store.group.TabGroupStore;
import ru.mgt.mailingService.base;
import ru.mgt.mailingService.group.model.dto.GroupDto;
import ru.mgt.mailingService.group.model.dto.ReportDto;
import ru.mgt.mailingService.group.repo.GroupIdRepository;
import ru.mgt.mailingService.group.repo.TabIdRepository;
import ru.mgt.mailingService.model.entity.TabIdEntity;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    final TabGroupStore taGroupStore;

    final UserStore userStore;

    final GroupIdRepository groupIdRepository;

    final TabIdRepository tabIdRepository;

    @Override
    public Set<String> getTabId(GroupDto dto) {

        base.ASD.throwIf(dto.getId() == null && dto.getTabId() == null);

        Set<String> res = new HashSet<>(dto.getTabId());

        if (dto.getId() != null) {
            res.addAll(taGroupStore.parallelStream()
                    .mapMulti((BiConsumer<KeyValue<String, TabGroup>, Consumer<String>>) (kv, c) -> {
                        if (kv.value.getGroupsList().stream().map(Protos::getUuid).anyMatch(dto.getId()::contains))
                            c.accept(kv.key);
                    })
                    .collect(Collectors.toSet()));
        }
        return res;
    }

    @Override
    public Set<UUID> getUuidUsers(Set<String> tabIds) {
        return userStore.parallelStream()
                .mapMulti((BiConsumer<KeyValue<UUID, User>, Consumer<UUID>>) (kv, c) -> {
                    if (kv.value.getTabIdsList().stream().anyMatch(tabIds::contains)) {
                        c.accept(kv.key);
                    }
                }).collect(Collectors.toSet());

    }

    public ReportDto getReport(GroupDto dto) {
        Collection<UUID> collection = getUuidUsers(getTabId(dto));
        AtomicInteger email = new AtomicInteger();
        AtomicInteger phone = new AtomicInteger();
        AtomicInteger push = new AtomicInteger();

        collection.forEach(uuid -> {
            var user = userStore.get(uuid);
            if (user.getEmail().contains("@")) {
                email.addAndGet(1);
            }
            if(user.getPhone().length() == 11 && user.getPhone().charAt(0) == '8') {
                phone.addAndGet(1);
            }
            //TODO добавить push
        });

        return new ReportDto(
                email.intValue(),
                phone.intValue(),
                collection.size()
        );
    }

    private List<TabIdEntity> toTabIdEntityList(Set<String> tabId) {
        return tabId.stream().map(TabIdEntity::new).toList();
    }

}
