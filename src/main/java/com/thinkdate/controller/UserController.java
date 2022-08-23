package com.thinkdate.controller;

import com.thinkdate.model.User;
import com.thinkdate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"", "/"})
    @ResponseBody
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId") Long id){
        return userService.findUserById(id).get();
    }

    @PostMapping("/login")
    public User getUserLogin(@ModelAttribute("email") @Valid String email, @ModelAttribute("password") @Valid String password, BindingResult bindingResult){
        // récupérera en POST le mail et le password
        User userLogged = new User();

        for (User user:userService.getAllUsers()) {
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password)){
                    userLogged = userService.login(user.getEmail(), user.getPassword()).get();
                }
            }
        }
        return userLogged;
    }
}
