package com.usermanagementsystem.usermanagementsystem;

import com.usermanagementsystem.usermanagementsystem.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class UserManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserManagementSystemApplication.class, args);
	}
}
