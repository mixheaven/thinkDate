package com.thinkdate.controller;

import com.thinkdate.model.Birthday;
import com.thinkdate.services.BirthdayService;
import com.thinkdate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users/{userId}/")
public class BirthdayController {

    @Autowired
    private BirthdayService birthdayService;
    @Autowired
    private UserService userService;

    @GetMapping("/birthdays")
    @ResponseBody
    public List<Birthday> getBirthdays(@PathVariable("userId") Long userId) {
        return userService.findUserById(userId).get().getBirthdays();
    }

    @PostMapping("/birthdays")
    public String createBirthday(@PathVariable("userId") Long userId,
                                 @ModelAttribute("firstname") @Valid String firstname,
                                 @ModelAttribute("lastname") @Valid String lastname,
                                 @ModelAttribute("date") @Valid String date,
                                 BindingResult bindingResult) {

        if (!bindingResult.hasErrors()) {
            birthdayService.save(new Birthday(firstname, lastname, userService.findUserById(userId).get(), LocalDate.parse(date)));
            return "Bien joué ! Création effectuée";
        }
        else {
            return "Mal joué ! Création échouée";
        }
    }

    @GetMapping("/birthdays/{birthdayId}")
    @ResponseBody
    public Birthday getSingleBirthday(@PathVariable("birthdayId") Long birthDayId) {
        return birthdayService.getBirthdayById(birthDayId).get();
    }
}
