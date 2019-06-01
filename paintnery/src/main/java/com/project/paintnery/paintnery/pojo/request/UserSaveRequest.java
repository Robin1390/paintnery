package com.project.paintnery.paintnery.pojo.request;

import com.project.paintnery.paintnery.pojo.UserDto;

import java.io.Serializable;

public class UserSaveRequest implements Serializable {
    private UserDto user;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
