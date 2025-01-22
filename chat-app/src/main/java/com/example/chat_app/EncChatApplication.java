package com.example.chat_app;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EncChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncChatApplication.class, args);
	}

}
