package ru.mgt.mailingService.group.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@Schema(description = "Информация о группах")
@Data
@NoArgsConstructor
public class GroupDto {

    @Schema(description = "Id группыы")
    List<UUID> id;

    @Schema(description = "Табельный номер")
    List<String> tabId;

    public GroupDto(List<UUID> id, List<String> tabId) {
        this.id = id;
        this.tabId = tabId;
    }
}
