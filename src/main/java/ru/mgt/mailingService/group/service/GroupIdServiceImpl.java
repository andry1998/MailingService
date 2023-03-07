package ru.mgt.mailingService.group.service;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import ru.mgt.mailingService.group.repo.GroupIdRepository;
import ru.mgt.mailingService.group.repo.TabIdRepository;
import ru.mgt.mailingService.model.entity.GroupIdEntity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class GroupIdServiceImpl implements GroupIdService{

    final GroupIdRepository groupIdRepository;

    final TabIdService tabIdService;

    final GroupService groupService;
    private final TabIdRepository tabIdRepository;

    @Override
    public void saveAll(@NonNull Set<String> tabIds) {
        groupIdRepository.saveAll(toGroupIdEntityList(groupService.getUuidUsers(tabIds)));
    }

    @NonNull
    @Override
    public List<UUID> getAll(@NonNull Set<String> tabIds) {
        return toGroupIdList(groupIdRepository.findAll());
    }

    private List<GroupIdEntity> toGroupIdEntityList(Set<UUID> groupId) {
        return groupId.stream().map(GroupIdEntity::new).toList();
    }

    private List<UUID> toGroupIdList(List<GroupIdEntity> groupIdEntities) {
        return groupIdEntities.stream().map(GroupIdEntity::getGroupId).toList();
    }
}
