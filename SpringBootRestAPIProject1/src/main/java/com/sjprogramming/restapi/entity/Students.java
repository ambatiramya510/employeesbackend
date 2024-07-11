package com.sjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="benny")
public class Students {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name="name")
	private String name;
	
	@Column(name="role")
	private String role;
	
	@Column(name="email")
	private String email;
	
	@Column(name="department")
	private String department;
	
	public Students() {
		
	}
	
	
	
	public Students(String name, String role, String email, String department) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.department=department;
	}



	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getdepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", role=" + role + ", email=" + email
				+ " department=" + department + "]";
	}
	
	

}
