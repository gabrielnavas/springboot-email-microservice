package com.ms.email.controllers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.Email;
import com.ms.email.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Object> sendingEmail (@RequestBody @Valid EmailDto body) {
        try {
            Email emailModel = new Email();
            BeanUtils.copyProperties(body, emailModel);
            Email emailCreated = emailService.sendEmail(emailModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(emailCreated);
        }
        catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new HashMap<>(){{
                put("message", "try later again");
            }});
        }
    }
}
