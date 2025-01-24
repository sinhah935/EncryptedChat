package com.example.chat_app.repository;

import java.util.List;
import com.example.chat_app.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
    
    List<ChatRoom> findByName(String name);
    // List<ChatRoom> findByUsersCountGreaterThan(int count);

}
