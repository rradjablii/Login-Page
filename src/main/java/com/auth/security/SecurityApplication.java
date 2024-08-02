package com.auth.security;

import com.auth.security.repo.UserRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityApplication {

	Dotenv dotenv = Dotenv.load();
	String dbUrl = dotenv.get("DB_URL");
	String dbUser = dotenv.get("DB_USER");
	String dbPassword = dotenv.get("DB_PASSWORD");

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
