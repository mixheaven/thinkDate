package com.thinkdate.services;

import com.thinkdate.model.Birthday;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BirthdayService {
    public List<Birthday> getAllUserBirthdays(Long userId);
    public Optional<Birthday> getBirthdayById(Long id);
    public Birthday save(Birthday birthday);
}
