package ru.mgt.mailingService.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import ru.mgt.icp.shared.exception.abstraction.ErrorCode;
import ru.mgt.mailingService.model.entity.SmsEntity;

@Schema(description = "Информация об Sms уведомлении")
@Data
@Validated
@NoArgsConstructor
public class SmsDto {

    @Schema(description = "Сообщение")
    @Length(max = 70)
    @NotBlank
    String message;


    public SmsDto(String message) {
        this.message = message;
    }

}
