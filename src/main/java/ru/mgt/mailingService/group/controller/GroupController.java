package ru.mgt.mailingService.group.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mgt.icp.shared.filter.response.wrapper.anotation.WrapRestController;
import ru.mgt.mailingService.group.model.dto.GroupDto;
import ru.mgt.mailingService.group.model.dto.ReportDto;
import ru.mgt.mailingService.group.service.GroupService;

@Tag(name = "Groups", description = "Управление группами")
@RequiredArgsConstructor
@WrapRestController
@Validated
@RequestMapping("/group")
@Slf4j
public class GroupController {

    final GroupService groupService;

    @Operation(summary = "Получить отчет о рассылки")
    @PostMapping("/report")
    public ReportDto getReport(@RequestBody GroupDto dto) {return groupService.getReport(dto);
    }

}
