package com.gdsc.backend.controller;

import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(path="/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/check")
//    public User getUser(@RequestParam int user_id) {
//        Optional<User> user = userRepository.findById(user_id);
//        return user.get();
//    }
//
//    @PostMapping("/join")
//    public User join(@RequestParam String name, String email) {
//        User new_user = new User();
//        new_user.setName(name);
//        new_user.setEmail(email);
//        User saved_user = userRepository.save(new_user);
//        return saved_user;
//    }
}
