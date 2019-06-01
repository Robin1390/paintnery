package com.project.paintnery.paintnery.controller;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.SmsSubmissionResponseMessage;
import com.nexmo.client.sms.messages.TextMessage;
import com.project.paintnery.paintnery.entity.UserEntity;
import com.project.paintnery.paintnery.persistance.das.UserDas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/testing")
public class TestController {

    private UserDas userDas;

    @Autowired
    public TestController(UserDas userDas) {
        this.userDas = userDas;
    }

    @GetMapping("/test")
    public String test(){
        UserEntity userEntity = new UserEntity();
        userDas.save(userEntity);
        return "Testing";
    }
}
