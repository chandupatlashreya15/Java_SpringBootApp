package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringBootBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(SpringBootBook.class, args);

	}

}
