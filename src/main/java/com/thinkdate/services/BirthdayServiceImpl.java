package com.thinkdate.services;

import com.thinkdate.model.Birthday;
import com.thinkdate.model.User;
import com.thinkdate.repositories.BirthdayRepository;
import com.thinkdate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BirthdayServiceImpl implements BirthdayService{

    @Autowired
    private BirthdayRepository birthdayRepository;
    @Autowired
    private UserService userService;



    /*public Optional<Birthday> getBirthdayById(Long id) {
        return birthdayRepository.findBirthdayByUserIdAndId(id);
    }*/

    @Override
    public List<Birthday> getAllUserBirthdays(Long userId) {
        return getAllUserBirthdays(userId);
    }

    @Override
    public Birthday save(Birthday birthday) {
        return birthdayRepository.save(birthday);
    }
}
