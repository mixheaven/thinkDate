package com.thinkdate.services;

import com.thinkdate.model.Birthday;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BirthdayService {
    public List<Birthday> getAllUserBirthdays(Long userId);
    public Birthday save(Birthday birthday);
}
