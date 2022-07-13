package com.authservice;

import com.authservice.documents.Role;
import com.authservice.documents.User;
import com.authservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	/*
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John", "john", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will", "will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jim", "jim", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Sam", "sam", "1234", new ArrayList<>()));

			userService.addRoleToUser("sam", "ROLE_ADMIN");

			userService.addRoleToUser("john", "ROLE_USER");
			//userService.addRoleToUser("will", "ROLE_MANAGER");
		};
	}
	 */

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
