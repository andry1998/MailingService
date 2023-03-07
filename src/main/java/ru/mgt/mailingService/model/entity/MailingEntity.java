package ru.mgt.mailingService.model.entity;

import jakarta.persistence.*;
import lombok.*;
import ru.mgt.icp.shared.entity.UuidEntity;
import ru.mgt.mailingService.model.dto.MailingDto;


@Entity
@NoArgsConstructor
@Data
@Table(name = "mailings")
public class MailingEntity extends UuidEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "push", referencedColumnName = "id")
    PushEntity push;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email", referencedColumnName = "id")
    EmailEntity email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sms", referencedColumnName = "id")
    SmsEntity sms;

    public MailingEntity(PushEntity push, EmailEntity email, SmsEntity sms){
        this.push = push;
        this.email = email;
        this.sms = sms;
    }
}
