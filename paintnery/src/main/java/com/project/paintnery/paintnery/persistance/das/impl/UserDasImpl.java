package com.project.paintnery.paintnery.persistance.das.impl;

import com.project.paintnery.paintnery.entity.UserEntity;
import com.project.paintnery.paintnery.persistance.das.UserDas;
import com.project.paintnery.paintnery.persistance.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDasImpl implements UserDas {

    private UserRepository userRepository;

    @Autowired
    public UserDasImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
