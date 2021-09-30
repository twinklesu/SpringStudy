package com.gdsc.backend;

import com.gdsc.backend.dto.user.UserDto;
import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
public class UserDtoTest extends BackendApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void dtoReadTest() {
        User newUser = new User();
        newUser.setName("박수빈");
        newUser.setEmail("twinklesu914@gmail.com");
        newUser.setUserId("twinklesu");
        newUser.setHp("010-3081-1524");
        newUser.setMajor("itm");
        newUser.setPassword("990104");
        newUser.setNickname("숩니");
        User saved_user = userRepository.save(newUser);

        Optional<User> user = userRepository.findById(saved_user.getId());

        ModelMapper modelMapper = new ModelMapper();

        if(user.isPresent()){
            UserDto userDto = modelMapper.map(user.get(), UserDto.class);
            assertThat(userDto.getName()).isEqualTo(newUser.getName());
            assertThat(userDto.getEmail()).isEqualTo(newUser.getEmail());
            assertThat(userDto.getUserId()).isEqualTo(newUser.getUserId());
            assertThat(userDto.getHp()).isEqualTo(newUser.getHp());
            assertThat(userDto.getNickname()).isEqualTo(newUser.getNickname());
            assertThat(userDto.getIsAuth()).isEqualTo(newUser.getIsAuth());
            assertThat(userDto.getProfilePic()).isEqualTo(newUser.getProfilePic());
        }
    }

}
