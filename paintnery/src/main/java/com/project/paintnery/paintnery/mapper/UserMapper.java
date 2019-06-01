package com.project.paintnery.paintnery.mapper;

import com.project.paintnery.paintnery.entity.UserEntity;
import com.project.paintnery.paintnery.mapper.impl.UserMapperImpl;
import com.project.paintnery.paintnery.pojo.UserDto;

public interface UserMapper {
    UserMapper INSTANCE = new UserMapperImpl();

    UserEntity convertToEntity(UserDto userDto);

    UserDto convertToDto(UserEntity userEntity);
}
