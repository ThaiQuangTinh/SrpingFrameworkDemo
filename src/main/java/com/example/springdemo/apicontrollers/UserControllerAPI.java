package com.example.springdemo.apicontrollers;

import com.example.springdemo.models.User;
import com.example.springdemo.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerAPI {

    private final UserService userService = new UserService();

    @GetMapping("/api/getUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/api/getUsersInfo")
    public List<Object> getUsersInfo() {
        return  userService.getUsersInfo();
    }

}
