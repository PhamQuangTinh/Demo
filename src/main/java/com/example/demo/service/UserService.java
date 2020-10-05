package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.UserEntity;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserJDBCRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//minidev json
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserJDBCRepository userJDBCRepository;

    public UserEntity addNewUserService(UserDTO user){
        return userDao.addNewUser(user);
    }

    public UserDTO findUserByIdService(Long id) {
        return userDao.findUserByIdDao(id);
    }

    public UserDTO findUserByUsernameService(String username) {
        return userDao.findUserByUsernameDao(username);
    }

    public JSONObject findUsersByFullName(String fullName){
        JSONObject res = new JSONObject();
        List<UserEntity> listUser = userJDBCRepository.findUsersByFullName(fullName);
        res.put("List User", listUser);
        return res;
    }
}
