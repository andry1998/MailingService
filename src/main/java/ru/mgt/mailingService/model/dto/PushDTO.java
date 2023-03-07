package ru.mgt.mailingService.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Schema(description = "Информация о Push уведомлении")
@NoArgsConstructor
@Data
@Validated

public class PushDTO {

    @NotBlank
    @Schema(description = "Заголовок уведомления")
    String header;

    @NotBlank
    @Schema(description = "Текст уведомления")
    String message;

    public PushDTO(String header, String message) {
        this.header = header;
        this.message = message;
    }
}
