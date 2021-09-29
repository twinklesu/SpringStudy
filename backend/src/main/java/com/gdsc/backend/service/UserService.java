package com.gdsc.backend.service;

import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Map<String, Object> UserInfoLookup(int id) {
//        Optional<User> user = userRepository.findById(id);
//        Map<String, Object>
//        return user;
//    }
}
