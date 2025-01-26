package com.example.chat_app;

// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
@EntityScan(basePackages = "com.example.chat_app.model")
public class EncChatApplication {
	public static void main(String[] args) {
		SpringApplication.run(EncChatApplication.class, args);
	}
}