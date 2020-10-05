package com.example.demo.repository.impl;

import com.example.demo.domain.UserEntity;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJDBCRepositoryImpl implements UserJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserEntity> findUsersByFullName(String name) {
        String sql = "select * from user u where u.full_name like ?";
        return jdbcTemplate.query(sql, new Object[]{"%"+name+"%"}, new BeanPropertyRowMapper<>(UserEntity.class));
    }

    @Override
    public int createNewUser(UserDTO userDTO) {
        return jdbcTemplate.update("insert into user(full_name,username,password,phone_number) values(?,?,?,?)",
                       userDTO.getFullName(), userDTO.getUsername(), userDTO.getPassword(), userDTO.getPhoneNumber());
    }


}
