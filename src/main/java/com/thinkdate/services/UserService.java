package com.thinkdate.services;

import com.thinkdate.model.User;
import com.thinkdate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public Optional<User> login(String email, String password);
    public List<User> getAllUsers();
    public Optional<User> findUserById(Long id);
    public User save(User user);
}
