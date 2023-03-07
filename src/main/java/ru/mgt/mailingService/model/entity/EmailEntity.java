package ru.mgt.mailingService.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Entity
@NoArgsConstructor
@Data
@Table(name = "email")
public class EmailEntity extends AbstractMessage{

    String topic;

    @OneToOne(mappedBy = "email")
    MailingEntity data;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "email", cascade = CascadeType.ALL)
    List<FileEntity> files;

    public EmailEntity(String topic, String message, List<FileEntity> files) {
        this.topic = topic;
        this.message = message;
        this.files = files;
    }
}
