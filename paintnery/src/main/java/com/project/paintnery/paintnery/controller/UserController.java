package com.project.paintnery.paintnery.controller;

import com.project.paintnery.paintnery.pojo.request.UserSaveRequest;
import com.project.paintnery.paintnery.pojo.response.UserSaveResponse;
import com.project.paintnery.paintnery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public UserSaveResponse save(@RequestBody final UserSaveRequest request) {
        return userService.save(request);
    }
}
