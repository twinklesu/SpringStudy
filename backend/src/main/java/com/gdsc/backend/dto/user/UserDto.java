package com.gdsc.backend.dto.user;

import lombok.*;

@Data
@Getter
@Setter
public class UserDto {

    private final String userId;
    private final String email;
    private final String hp;
    private final String name;
    private final String nickname;
    private final boolean isAuth;
    private final String profilePic;

}
