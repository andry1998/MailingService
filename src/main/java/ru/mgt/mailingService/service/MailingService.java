package ru.mgt.mailingService.service;

import org.springframework.lang.NonNull;
import ru.mgt.mailingService.model.dto.EmailDTO;
import ru.mgt.mailingService.model.dto.MailingDto;
import ru.mgt.mailingService.model.dto.PushDTO;
import ru.mgt.mailingService.model.dto.SmsDto;

import java.util.List;
import java.util.UUID;

public interface MailingService {

    List<MailingDto> getAll();

    @NonNull
    MailingDto create(@NonNull MailingDto dto);

    @NonNull
    MailingDto update(@NonNull UUID id, @NonNull MailingDto dto);

    void delete(@NonNull UUID id);

    void deleteAll();

    List<EmailDTO> getEmail();

    List<PushDTO> getPush();

    List<SmsDto> getSms();
}
