package ru.mgt.mailingService.repo;

import ru.mgt.icp.shared.entity.UuidRepository;
import ru.mgt.mailingService.model.entity.MailingEntity;

import java.util.UUID;

public interface MailingRepository extends UuidRepository<MailingEntity> {
    MailingEntity findDataEntityById(UUID id);
}
