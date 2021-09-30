package com.gdsc.backend.controller;

import com.gdsc.backend.dto.user.UserDto;
import com.gdsc.backend.repository.UserRepository;
import com.gdsc.backend.response.BasicResponse;
import com.gdsc.backend.response.FailResponse;
import com.gdsc.backend.response.SuccessResponse;
import com.gdsc.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public BasicResponse getUser() { // 세션 인증으로 id 넣어줘야됨,,
        int id = 1; //일단 이렇게.. 나중에 수정........ㅜ
        Optional<UserDto> userDto = userService.UserInfoLookup(id);
        if (userDto.isPresent()) {
            return new SuccessResponse<>(userDto.get());
        }
        return new FailResponse<>("");
    }
}
