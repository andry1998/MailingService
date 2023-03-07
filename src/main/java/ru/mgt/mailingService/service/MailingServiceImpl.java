package ru.mgt.mailingService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mgt.mailingService.base;
import ru.mgt.mailingService.model.dto.*;
import ru.mgt.mailingService.model.entity.MailingEntity;
import ru.mgt.mailingService.repo.MailingRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MailingServiceImpl implements MailingService {

    final MailingRepository repository;

    final MailingMapper mapper;

    @Transactional(readOnly = true)
    @Override
    public List<MailingDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<EmailDTO> getEmail() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .map(MailingDto::getEmail)
                .collect(Collectors.toList());
    }

    @Override
    public List<PushDTO> getPush() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .map(MailingDto::getPush)
                .collect(Collectors.toList());
    }

    @Override
    public List<SmsDto> getSms() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .map(MailingDto::getSms)
                .collect(Collectors.toList());
    }

    @NonNull
    @Transactional()
    @Override
    public MailingDto create(@NonNull MailingDto dto) {
        emptyMailing(dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @NonNull
    @Transactional()
    @Override
    public MailingDto update(@NonNull UUID id, @NonNull MailingDto dto) {
        MailingEntity entity = repository.findDataEntityById(id);
        MailingEntity newEntity = mapper.toEntity(dto);
        entity.setPush(newEntity.getPush());
        entity.setEmail(newEntity.getEmail());
        entity.setSms(newEntity.getSms());
        return mapper.toDto(repository.save(entity));
    }

    @Transactional()
    @Override
    public void delete(@NonNull UUID id) {
        repository.delete(repository.findDataEntityById(id));
    }

    @Transactional()
    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    private void emptyMailing(MailingDto dto) {
        base.ASD.throwIf(
                dto.getPush() == null
                && dto.getEmail() == null
                && dto.getSms() == null
        );
    }
}
