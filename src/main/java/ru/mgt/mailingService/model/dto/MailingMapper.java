package ru.mgt.mailingService.model.dto;

import org.springframework.lang.NonNull;
import ru.mgt.mailingService.model.entity.MailingEntity;

public interface MailingMapper {
    @NonNull
    MailingEntity toEntity(@NonNull MailingDto dto);

    @NonNull
    MailingDto toDto(@NonNull MailingEntity entity);
}
