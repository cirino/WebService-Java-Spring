package com.casadodev.course.config;

import com.casadodev.course.entities.User;
import com.casadodev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "nome 3", "email@eu.com", "+551118564", "123456");
		User u2 = new User(null, "nome 4", "email2@eu.com", "+559999995", "987654");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
