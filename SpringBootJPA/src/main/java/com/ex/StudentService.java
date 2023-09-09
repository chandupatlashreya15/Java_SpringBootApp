package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public void insert(Student s) {
		sr.save(s);
	}
	public void delete(int id) {
		sr.deleteById(id);
	}
	public void select() {
		List<Student> li=sr.findAll();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Student s=(Student)i.next();
			System.out.println(s.getSid()+" "+s.getName()+" "+s.getMarks()+" "+s.getSection()+" "+s.getBranch());
			
		}
	}
	public void update() {
		sr.updateMarks(498, 1000);
	}
	
}
