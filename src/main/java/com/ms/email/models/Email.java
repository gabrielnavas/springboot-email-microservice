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

    private String ownerRef; // proprietário de quem ta mandando o email, id do usuário pra quem esta sendo enviado o email
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")

    private String text;

    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setOwnerRef(String ownerRef) {
        this.ownerRef = ownerRef;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSendDateEmail(LocalDateTime sendDateEmail) {
        this.sendDateEmail = sendDateEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }
}
