package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootJPA.class, args);
		StudentService s= context.getBean(StudentService.class);
     	Student x=new Student();
		x.setSid(950);
		x.setName("Vijaya");
		x.setMarks(200);
		x.setSection("A");
		x.setBranch("CSE");
		
		s.insert(x);
//		s.delete(1026);
//		s.select();
//		s.update();
		
	}

}
