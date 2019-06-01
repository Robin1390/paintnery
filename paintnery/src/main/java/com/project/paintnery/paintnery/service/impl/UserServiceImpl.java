package com.project.paintnery.paintnery.service.impl;

import com.project.paintnery.paintnery.entity.UserEntity;
import com.project.paintnery.paintnery.mapper.UserMapper;
import com.project.paintnery.paintnery.persistance.das.UserDas;
import com.project.paintnery.paintnery.pojo.request.UserSaveRequest;
import com.project.paintnery.paintnery.pojo.response.UserSaveResponse;
import com.project.paintnery.paintnery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDas userDas;

    @Autowired
    public UserServiceImpl(UserDas userDas) {
        this.userDas = userDas;
    }

    @Override
    public UserSaveResponse save(UserSaveRequest userSaveRequest) {
        UserSaveResponse userSaveResponse = new UserSaveResponse();
        UserEntity userEntity = UserMapper.INSTANCE.convertToEntity(userSaveRequest.getUser());
        userEntity = userDas.save(userEntity);
        userSaveResponse.setUser(UserMapper.INSTANCE.convertToDto(userEntity));
        userSaveResponse.setSaved(userEntity.getId() != null);
        return userSaveResponse;
    }
}
