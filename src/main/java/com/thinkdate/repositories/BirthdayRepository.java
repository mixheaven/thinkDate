package com.thinkdate.repositories;

import com.thinkdate.model.Birthday;
import com.thinkdate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BirthdayRepository extends JpaRepository<Birthday, Long> {
    Optional<Birthday> findBirthdayByUserIdAndId(Long user, Long id);
}
