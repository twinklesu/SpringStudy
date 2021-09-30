package com.gdsc.backend;

import com.gdsc.backend.controller.UserController;
import com.gdsc.backend.entity.User;
import com.gdsc.backend.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest extends BackendApplicationTests{

    @Autowired
    private UserController userController;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void beforeEach(){
        User newUser = new User();
        newUser.setName("Subin Park");
        newUser.setEmail("twinklesu914@gmail.com");
        newUser.setUserId("twinklesu");
        newUser.setHp("010-3081-1524");
        newUser.setMajor("itm");
        newUser.setPassword("990104");
        newUser.setNickname("subin");
        userRepository.save(newUser);
    }

    @Test
    public void getUserTest() throws Exception {
        String url = "/api/user";

        mockMvc.perform(MockMvcRequestBuilders.get(url)
            .contentType(MediaType.APPLICATION_JSON))
                .andExpect(result -> {
                    MockHttpServletResponse response = result.getResponse();
                    System.out.println(response.getContentAsString());
                });
    }

}
