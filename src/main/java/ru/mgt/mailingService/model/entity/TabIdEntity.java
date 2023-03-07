package ru.mgt.mailingService.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mgt.icp.shared.entity.UuidEntity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tab_id")
public class TabIdEntity extends UuidEntity {

    String tab_id;
}
