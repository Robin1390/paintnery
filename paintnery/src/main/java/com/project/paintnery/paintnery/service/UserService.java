package com.project.paintnery.paintnery.service;

import com.project.paintnery.paintnery.pojo.request.UserSaveRequest;
import com.project.paintnery.paintnery.pojo.response.UserSaveResponse;

public interface UserService {

    UserSaveResponse save(UserSaveRequest userSaveRequest);
}
