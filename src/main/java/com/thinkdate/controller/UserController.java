package com.thinkdate.controller;

import com.thinkdate.model.User;
import com.thinkdate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"", "/"})
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}
