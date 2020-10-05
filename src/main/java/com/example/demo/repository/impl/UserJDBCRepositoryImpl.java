package com.example.demo.repository.impl;

import com.example.demo.domain.UserEntity;
import com.example.demo.repository.UserJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJDBCRepositoryImpl implements UserJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserEntity> findUsersByFullName(String name) {
        return List.of(new UserEntity("124","pham","gds","0098375"));
    }
}
