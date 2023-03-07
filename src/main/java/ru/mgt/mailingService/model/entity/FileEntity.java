package ru.mgt.mailingService.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mgt.icp.shared.entity.UuidEntity;

@Entity
@NoArgsConstructor
@Data
@Table(name = "file")
public class FileEntity extends UuidEntity {

    String fileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email")
    private EmailEntity email;

    public FileEntity(String fileName) {this.fileName = fileName;}
}
