package ru.mgt.mailingService.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Schema(description = "Информация о файлах уведомления")
@NoArgsConstructor
@Data
public class FileDto {

    @Schema(description = "Id файлов")
    @NotBlank
    MultipartFile file;

    public FileDto(MultipartFile file) {
        this.file = file;
    }
}
