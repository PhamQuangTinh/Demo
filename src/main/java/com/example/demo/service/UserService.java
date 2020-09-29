package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.UserEntity;
import com.example.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity addNewUserService(UserDTO user){
        return userDao.addNewUser(user);
    }

    public UserDTO findUserByIdService(Long id) {
        return userDao.findUserByIdDao(id);
    }

    public UserDTO findUserByUsernameService(String username) {
        return userDao.findUserByUsernameDao(username);
    }
}
