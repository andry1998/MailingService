package ru.mgt.mailingService.group.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Schema(description = "Информация о users")
@Data
@Validated
@NoArgsConstructor
public class ReportDto {

    @Schema(description = "Количество email для рассылки")
    int email;

    @Schema(description = "Количество phone для рассылки")
    int phone;

    @Schema(description = "Количество всех пользователей для рассылки")
    int all;

    public ReportDto(int email, int phone, int all) {
        this.email = email;
        this.phone = phone;
        this.all = all;
    }
}
