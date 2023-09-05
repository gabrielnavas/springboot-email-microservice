package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_EMAIL")
public class Email implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private final String ownerRef; // proprietário de quem ta mandando o email, id do usuário pra quem esta sendo enviado o email
    private final String emailFrom;
    private final String emailTo;
    private final String subject;

    @Column(columnDefinition = "TEXT")

    private final String text;

    private final LocalDateTime sendDateEmail;
    private final StatusEmail statusEmail;

    public Email() {
        this(
                0L,
                "",
                "",
                "",
                "",
                "",
                LocalDateTime.now(),
                StatusEmail.ERROR
        );
    }

    public Email(String ownerRef, String emailFrom, String emailTo, String subject, String text, LocalDateTime sendDateEmail, StatusEmail statusEmail) {
        this.ownerRef = ownerRef;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.subject = subject;
        this.text = text;
        this.sendDateEmail = sendDateEmail;
        this.statusEmail = statusEmail;
    }

    public Email(Long id, String ownerRef, String emailFrom, String emailTo, String subject, String text, LocalDateTime sendDateEmail, StatusEmail statusEmail) {
        this.id = id;
        this.ownerRef = ownerRef;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.subject = subject;
        this.text = text;
        this.sendDateEmail = sendDateEmail;
        this.statusEmail = statusEmail;
    }

    public Long getId() {
        return id;
    }

    public String getOwnerRef() {
        return ownerRef;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getSendDateEmail() {
        return sendDateEmail;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }
}
