package com.vanivsky.taskList.controller;

import com.vanivsky.taskList.entity.User;
import com.vanivsky.taskList.repository.UserRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("add")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
