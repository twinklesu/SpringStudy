package com.gdsc.backend.service;

import com.gdsc.backend.dto.user.UserDto;
import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserDto> UserInfoLookup(int id) {
        Optional<User> user = userRepository.findById(id);
        UserDto userDto = new UserDto();
        if (user.isPresent()) {
            userDto = modelMapper.map(user.get(), UserDto.class);
        }
        return Optional.ofNullable(userDto);
    }
}
