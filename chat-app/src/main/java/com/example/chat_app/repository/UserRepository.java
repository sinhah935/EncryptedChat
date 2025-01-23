package com.example.chat_app.repository;

import java.util.List;
import com.example.chat_app.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);

    // User findById(Long id);
}