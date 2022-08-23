package com.thinkdate.repositories;

import com.thinkdate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByLastnameAndPassword(String lastname, String password);
}
