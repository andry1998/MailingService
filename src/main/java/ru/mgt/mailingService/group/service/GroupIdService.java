package ru.mgt.mailingService.group.service;

import org.springframework.lang.NonNull;
import ru.mgt.mailingService.group.model.dto.GroupDto;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface GroupIdService {

    void saveAll(@NonNull Set<String> groupIds);

    @NonNull List<UUID> getAll(@NonNull Set<String> tabIds);
}
