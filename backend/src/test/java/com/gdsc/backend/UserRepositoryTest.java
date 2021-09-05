package com.gdsc.backend;

import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@Transactional
@SpringBootTest
public class UserRepositoryTest extends BackendApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User new_user = new User();
        new_user.setName("gdsc");
        new_user.setEmail("gdsc@gamil.com");
        User saved_user = userRepository.save(new_user);

        Optional<User> user = userRepository.findById(saved_user.getUser_id());
        assertThat("gdsc").isEqualTo(user.get().getName());
        assertThat("gdsc@gamil.com").isEqualTo(user.get().getEmail());
    }

    @Test
    public void read() {
        // 이미 워크벤치에서 만들어 둔 테이블 있으니까 read 먼저
        Optional<User> user = userRepository.findById(1);
        assertThat("Subin").isEqualTo(user.get().getName());
        assertThat("twinklesu914@gmail.com").isEqualTo(user.get().getEmail());
    }
}
