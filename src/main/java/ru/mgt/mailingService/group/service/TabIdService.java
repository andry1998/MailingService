package ru.mgt.mailingService.group.service;

import org.springframework.lang.NonNull;
import ru.mgt.mailingService.group.model.dto.GroupDto;

import java.util.List;
import java.util.Set;

public interface TabIdService {

    void saveAll(GroupDto dto);

    @NonNull List<String> getAll();
}
