package com.ex;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	private int sid;
	@Column(name="name")
	private String name;
	@Column(name="marks")
	private int marks;
	@Column(name="section")
	private String section;
	@Column(name="branch")
	private String branch;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
