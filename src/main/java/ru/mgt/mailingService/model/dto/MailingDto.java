package ru.mgt.mailingService.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.*;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;


import java.util.UUID;


@Schema(description = "Информация о рассылке")
@Data
@Validated
@NoArgsConstructor
public class MailingDto {

    @Schema(description = "Id рассылки")
    UUID id;

    @Valid
    @Schema(description = "Push уведомление")
    PushDTO push;

    @Valid
    @Schema(description = "Email уведомление")
    EmailDTO email;

    @Valid
    @Schema(description = "Sms уведомление")
    SmsDto sms;

    public MailingDto(PushDTO push, EmailDTO email, SmsDto sms) {
        this.push = push;
        this.email = email;
        this.sms = sms;
    }
}
