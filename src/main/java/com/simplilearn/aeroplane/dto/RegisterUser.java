package com.simplilearn.aeroplane.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Registered")
public class RegisterUser {

	@Id
	@Column(name="SNo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int seqNo;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Fname")
	private String fname;
	
	@Column(name="Lname")
	private String lname;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Password")
	private String password;
	
	
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public RegisterUser() {
		
	}
	
	
	@Override
	public String toString() {
		return "RegisterUser [seqNo=" + seqNo + ", username=" + username + ", fname=" + fname + ", lname=" + lname
				+ ", name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	public RegisterUser(String username, String fname, String lname, String name, int age, String password) {
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
}
