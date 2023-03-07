package ru.mgt.mailingService.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Schema(description = "Информация об Email уведомлении")
@NoArgsConstructor
@Data
public class EmailDTO {

    @Schema(description = "Тема уведомления")
    @NotBlank
    String topic;

    @Schema(description = "Файлы уведомления")
    List<FileDto> files;

    @NotBlank
    @Schema(description = "Текст уведомления")
    String message;

    public EmailDTO(String topic, String message, List<FileDto> files) {
        this.topic = topic;
        this.message = message;
        this.files = files;
    }
}
