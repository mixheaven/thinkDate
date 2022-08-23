package com.thinkdate.services;

import com.thinkdate.model.Birthday;

import java.util.List;
import java.util.Optional;

public interface BirthdayService {
    public List<Birthday> getAllUserBirthdays(Long userId);
    public Birthday save(Birthday birthday);
}
