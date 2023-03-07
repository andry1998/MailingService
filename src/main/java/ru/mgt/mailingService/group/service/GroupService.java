package ru.mgt.mailingService.group.service;

import ru.mgt.mailingService.group.model.dto.GroupDto;
import ru.mgt.mailingService.group.model.dto.ReportDto;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public interface GroupService {

    ReportDto getReport(GroupDto dto);

    Set<String> getTabId(GroupDto dto);

    Set<UUID> getUuidUsers(Set<String> tabIds);
}
