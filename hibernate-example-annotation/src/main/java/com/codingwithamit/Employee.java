package com.codingwithamit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "mydb.employee")   
public class Employee {
	@Id   
	private int id;    
	private String name;    
	private String emailId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}   
	
	
}
