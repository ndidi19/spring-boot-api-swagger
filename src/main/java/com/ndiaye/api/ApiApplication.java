package com.ndiaye.api;

import com.ndiaye.api.entity.User;
import com.ndiaye.api.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	private final IUserRepository userRepository;

	public ApiApplication(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u = new User(
				"John", "Doe", "john.doe@gmail.com", "36 boulevard des rosiers", "75010", "France",
				27L);
		User u1 = new User(
				"Jack", "Ma", "jack.ma@gmail.com", "43 boulevard des tulipiers", "93110", "France",
				33L);
		User u2 = new User(
				"Jennifer", "Aniston", "jennifer.aniston@gmail.com", "99 Melrose Boulevard", "65ML", "US",
				40L);

		userRepository.save(u);
		userRepository.save(u1);
		userRepository.save(u2);
	}
}
