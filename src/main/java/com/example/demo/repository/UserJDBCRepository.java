package com.example.demo.repository;

import com.example.demo.domain.UserEntity;
import com.example.demo.dto.UserDTO;

import java.util.List;

public interface UserJDBCRepository {

    List<UserEntity> findUsersByFullName(String name);

    int createNewUser(UserDTO userDTO);


}
