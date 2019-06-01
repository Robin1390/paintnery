package com.project.paintnery.paintnery.mapper.impl;

import com.project.paintnery.paintnery.entity.UserEntity;
import com.project.paintnery.paintnery.mapper.UserMapper;
import com.project.paintnery.paintnery.pojo.UserDto;

public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity convertToEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setDateOfBirth(userDto.getDateOfBirth());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setMobileNumber(userDto.getMobileNumber());
        userEntity.setGender(userDto.getGender());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }

    @Override
    public UserDto convertToDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setDateOfBirth(userEntity.getDateOfBirth());
        userDto.setEmail(userEntity.getEmail());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setMobileNumber(userEntity.getMobileNumber());
        userDto.setGender(userEntity.getGender());
        userDto.setPassword(userEntity.getPassword());
        return userDto;
    }
}
