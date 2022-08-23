package com.thinkdate.services;

import com.thinkdate.model.User;
import com.thinkdate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> login(String email, String password) {
        return userRepository.findUserByEmailAndPassword(email, password);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }
}
