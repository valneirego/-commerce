package com.valneirego.commerce;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
@EntityScan (basePackages = "com.valneirego.commerce")
public class CommerceApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(CommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));

	}
}
