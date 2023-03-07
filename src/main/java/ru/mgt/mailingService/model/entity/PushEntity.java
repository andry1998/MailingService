package ru.mgt.mailingService.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "push")
public class PushEntity extends AbstractMessage {

    String header;

    @OneToOne(mappedBy = "push")
    MailingEntity data;

    public PushEntity(String header, String message) {
        this.header = header;
        this.message = message;
    }
}
