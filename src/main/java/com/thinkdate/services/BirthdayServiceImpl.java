package com.thinkdate.services;

import com.thinkdate.model.Birthday;
import com.thinkdate.model.User;
import com.thinkdate.repositories.BirthdayRepository;
import com.thinkdate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BirthdayServiceImpl implements BirthdayService{

    @Autowired
    private BirthdayRepository birthdayRepository;
    @Autowired
    private BirthdayService birthdayService;
    @Autowired
    private UserService userService;



    /*public Optional<Birthday> getBirthdayById(Long id) {
        return birthdayRepository.findBirthdayByUserIdAndId(id);
    }*/

    @Override
    public List<Birthday> getAllUserBirthdays(Long userId) {
        return birthdayService.getAllUserBirthdays(userId);
    }

    @Override
    public Birthday save(Birthday birthday) {
        return birthdayRepository.save(birthday);
    }
}
