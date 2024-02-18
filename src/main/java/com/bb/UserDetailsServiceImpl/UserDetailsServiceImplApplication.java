package com.bb.UserDetailsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class UserDetailsServiceImplApplication implements CommandLineRunner {

	@Autowired
	MyUserRepository myUserRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsServiceImplApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MyUser user = MyUser.builder()
				.userName("Honey")
				.authorities("dev")
				.email("honey@gmail.com")
				.password(passwordEncoder.encode("honey123"))
				.build();

		//user with mutliple authorities
		MyUser user1 = MyUser.builder()
				.userName("Rahul")
				.email("rahul@gmail.com")
				.password(passwordEncoder.encode("rahul123"))
				.authorities("qa,dev")
				.build();

		MyUser user2 = MyUser.builder()
				.userName("Sai")
				.email("sai@gmail.com")
				.password(passwordEncoder.encode("sai123"))
				.authorities("dev")
				.build();

		MyUser user3 = MyUser.builder()
				.userName("Rahul")
				.email("rahul@yahoo.co.in")
				.password(passwordEncoder.encode("rahul123"))
				.authorities("dev")
				.build();

		MyUser user4 = MyUser.builder()
				.userName("Kanika")
				.email("kanika@gmail.com")
				.password(passwordEncoder.encode("kanika123"))
				.authorities("dev")
				.build();

		MyUser user5 = MyUser.builder()
				.userName("Pinak")
				.email("pinak@gmail.com")
				.password(passwordEncoder.encode("pinak123"))
				.authorities("dev")
				.build();

		MyUser user6 = MyUser.builder()
				.userName("Carolina")
				.email("carolina@gmail.com")
				.password(passwordEncoder.encode("carolina123"))
				.authorities("dev")
				.build();
		try{
			myUserRepository.saveAll(Arrays.asList(user, user1, user2, user3, user4, user5, user6));
		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
