package com.neoprism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ca= SpringApplication.run(SpringBootJdbc.class,args);
		SpringDAO s=ca.getBean(SpringDAO.class);
//		s.insert();
//		s.update();
//		s.delete();
		s.select();


	}

}
