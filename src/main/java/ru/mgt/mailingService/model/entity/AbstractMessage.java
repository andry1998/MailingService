package ru.mgt.mailingService.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.mgt.icp.shared.entity.UuidEntity;


@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class AbstractMessage extends UuidEntity {

    @Column
    String message;
}
