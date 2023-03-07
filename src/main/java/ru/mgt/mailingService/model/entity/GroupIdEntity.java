package ru.mgt.mailingService.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mgt.icp.shared.entity.UuidEntity;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "group_id")
public class GroupIdEntity extends UuidEntity {

    UUID groupId;

}
