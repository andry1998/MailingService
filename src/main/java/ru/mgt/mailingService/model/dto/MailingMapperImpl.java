package ru.mgt.mailingService.model.dto;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import ru.mgt.mailingService.model.entity.*;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MailingMapperImpl implements MailingMapper {
    @NonNull
    @Override
    public MailingEntity toEntity(@NonNull MailingDto dto) {
        MailingEntity entity = new MailingEntity();
        setPush(dto, entity);
        setEmail(dto, entity);
        setSms(dto, entity);
        return entity;
    }

    @NonNull
    @Override
    public MailingDto toDto(@NonNull MailingEntity entity) {
        MailingDto dto = new MailingDto();
        dto.setId(entity.getId());
        setPush(entity, dto);
        setEmail(entity, dto);
        setSms(entity, dto);
        return dto;
    }


    private static void setPush(@NonNull MailingDto dto, MailingEntity entity) {
        PushDTO pushDTO = dto.getPush();
        if (pushDTO != null) {
            PushEntity pushEntity =  new PushEntity(pushDTO.getHeader(), pushDTO.getMessage());
            entity.setPush(pushEntity);
        }
    }

    private static void setPush(MailingEntity entity, @NonNull MailingDto dto) {
        PushEntity pushEntity = entity.getPush();
        if (pushEntity != null) {
            PushDTO pushDTO =  new PushDTO(pushEntity.getHeader(), pushEntity.getMessage());
            dto.setPush(pushDTO);
        }
    }

    private static void setEmail(@NonNull MailingDto dto, MailingEntity entity) {
        EmailDTO emailDTO = dto.getEmail();
        if (emailDTO != null) {
            List<FileEntity> fileEntities = emailDTO.getFiles().stream().map(file -> new FileEntity(file.getFile().getName())).toList();
            EmailEntity emailEntity =  new EmailEntity(
                    emailDTO.getTopic(),
                    emailDTO.getMessage(),
                    fileEntities);
            entity.setEmail(emailEntity);
        }
    }

    private static void setEmail(MailingEntity entity, @NonNull MailingDto dto) {
        EmailEntity emailEntity = entity.getEmail();
        if (emailEntity != null) {
            EmailDTO emailDTO =  new EmailDTO(
                    emailEntity.getTopic(),
                    emailEntity.getMessage(),
                    null);
            dto.setEmail(emailDTO);
        }
    }

    private static void setSms(@NonNull MailingDto dto, MailingEntity entity) {
        SmsDto smsDto = dto.getSms();
        if (smsDto != null) {
            SmsEntity smsEntity =  new SmsEntity(smsDto.getMessage());
            entity.setSms(smsEntity);
        }
    }

    private static void setSms(MailingEntity entity, @NonNull MailingDto dto) {
        SmsEntity smsEntity = entity.getSms();
        if (smsEntity != null) {
            SmsDto smsDTO =  new SmsDto(smsEntity.getMessage());
            dto.setSms(smsDTO);
        }
    }
}
