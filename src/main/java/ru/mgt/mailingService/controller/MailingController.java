package ru.mgt.mailingService.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.mgt.icp.shared.filter.response.wrapper.anotation.WrapRestController;
import ru.mgt.mailingService.model.dto.MailingDto;
import ru.mgt.mailingService.service.MailingService;

import java.util.List;
import java.util.UUID;

@Tag(name = "Mailing", description = "Управление рассылками")
@RequiredArgsConstructor
@WrapRestController
@Validated
@RequestMapping("/")
@Slf4j
public class MailingController {

    final MailingService mailingService;

    @Operation(summary = "Получение всех рассылок")
    @GetMapping("all")
    public List<MailingDto> getAll() {
        return mailingService.getAll();
    }

    @Operation(summary = "Создание рассылки")
    @PostMapping("create")
    public MailingDto createData(@Valid @RequestBody MailingDto dto) {
        return mailingService.create(dto);
    }

    @Operation(summary = "Изменение данных о рассылки")
    @PutMapping("update/{id}")
    public MailingDto updateData(@Valid @PathVariable UUID id, @Valid @RequestBody MailingDto dto) {
        return mailingService.update(id, dto);
    }

    @Operation(summary = "Удаление рассылки")
    @DeleteMapping("delete/{id}")
    public void deleteData(@Valid @PathVariable UUID id) {
        mailingService.delete(id);
    }

    @Operation(summary = "Удаление всех рассылок")
    @DeleteMapping("delete/all")
    public void deleteAll() {
        mailingService.deleteAll();
    }

}
