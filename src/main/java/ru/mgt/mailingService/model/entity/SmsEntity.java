package ru.mgt.mailingService.model.entity;

import lombok.*;

import jakarta.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Data
@Table(name = "sms")
public class SmsEntity extends AbstractMessage {

    @OneToOne(mappedBy = "sms")
    MailingEntity data;

    public SmsEntity(String message) {
        this.message = message;
    }
}
