package com.project.paintnery.paintnery.pojo.response;

import com.project.paintnery.paintnery.pojo.UserDto;

import java.io.Serializable;

public class UserSaveResponse implements Serializable {

    private UserDto user;
    private boolean saved;

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
