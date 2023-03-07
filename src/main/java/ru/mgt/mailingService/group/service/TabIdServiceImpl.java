package ru.mgt.mailingService.group.service;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import ru.mgt.mailingService.group.model.dto.GroupDto;
import ru.mgt.mailingService.group.repo.TabIdRepository;
import ru.mgt.mailingService.model.entity.TabIdEntity;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TabIdServiceImpl implements TabIdService{

    final GroupService groupService;

    final TabIdRepository tabIdRepository;

    @Override
    public void saveAll(GroupDto dto) {
            tabIdRepository.saveAll(toTabIdEntityList(groupService.getTabId(dto)));
    }

    @NonNull
    @Override
    public List<String> getAll() {
        return toTabIdList(tabIdRepository.findAll());
    }

    private List<TabIdEntity> toTabIdEntityList(Set<String> tabId) {
        return tabId.stream().map(TabIdEntity::new).toList();
    }

    private List<String> toTabIdList(List<TabIdEntity> tabIdEntities) {
        return tabIdEntities.stream().map(TabIdEntity::getTab_id).toList();
    }
}
