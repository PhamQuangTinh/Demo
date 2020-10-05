package com.example.demo.rest;


import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserRest {

    @Autowired
    private UserService userService;

    @PostMapping("/post/add_new_user")
    public ResponseEntity<?> addNewUserController(@RequestBody UserDTO request){
        return ResponseEntity.ok(userService.addNewUserService(request));

    }

    @PostMapping("/post/add_new_user_jdbc")
    public JSONObject addNewUserJDBC(@RequestBody UserDTO request){
        return userService.addNewUserJDBC(request);
    }

    @GetMapping("/get/find_user_by_id")
    public ResponseEntity<?> findUserByIdController(@RequestParam("id") Long id){
        return ResponseEntity.ok(userService.findUserByIdService(id));
    }

    @GetMapping("/get/find_by_username")
    public ResponseEntity<?> findUserByUsername(@RequestParam("username") String username){
        return ResponseEntity.ok(userService.findUserByUsernameService(username));
    }

    @GetMapping("/get/find_by_full_name")
    public JSONObject findUserByFullName(@RequestParam("full_name") String fullName){
        return userService.findUsersByFullName(fullName);
    }
}
