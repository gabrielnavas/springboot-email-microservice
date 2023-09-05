package com.ms.email.services;

import com.ms.email.dtos.EmailDto;
import com.ms.email.enums.StatusEmail;
import com.ms.email.models.Email;
import com.ms.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public Email sendEmail(Email emailModel) {
        return emailRepository.save(emailModel);
    }
}
