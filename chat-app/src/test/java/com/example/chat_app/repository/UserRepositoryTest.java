package com.example.chat_app.repository;

import com.example.chat_app.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.Test;
import com.example.chat_app.*;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
@ContextConfiguration(classes = EncChatApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository; 

    @Test
    public void testSaveUser() {
        
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        userRepository.save(user);
        
        User savedUser = userRepository.save(user);

        assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getUsername()).isEqualTo("test");
        assertThat(savedUser.getPassword()).isEqualTo("test");

        }

}
