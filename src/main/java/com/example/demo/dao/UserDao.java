package com.example.demo.dao;

import com.example.demo.domain.UserEntity;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public UserEntity addNewUser(UserDTO userDTO){
        UserEntity userEntity = UserDTO.transferObject(userDTO, UserEntity.class);
        return userRepository.saveAndFlush(userEntity);
    }

    public UserDTO findUserByIdDao(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        if(userEntity != null){
            return UserDTO.transferObject(userEntity, UserDTO.class);
        }
        return null;
    }

    public UserDTO findUserByUsernameDao(String username) {
        UserEntity userEntity = userRepository.findByUsernameRepository(username).orElse(null);
        if(userEntity != null){
            return UserDTO.transferObject(userEntity, UserDTO.class);
        }
        return null;
    }
}

