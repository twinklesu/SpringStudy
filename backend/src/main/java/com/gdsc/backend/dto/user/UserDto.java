package com.gdsc.backend.dto.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private String userId;
    private String email;
    private String hp;
    private String name;
    private String nickname;
    private boolean isAuth;
    private String profilePic;

}
