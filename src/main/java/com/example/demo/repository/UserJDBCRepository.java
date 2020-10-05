package com.example.demo.repository;

import com.example.demo.domain.UserEntity;

import java.util.List;

public interface UserJDBCRepository {

    List<UserEntity> findUsersByFullName(String name);


}
