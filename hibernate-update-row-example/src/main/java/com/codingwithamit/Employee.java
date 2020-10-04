package com.codingwithamit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Embeddable
class CompositeKey implements Serializable
{
    @Column(name = "id")
	private int id;      
    @Column(name = "emailId")
	private String emailId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
}

@Entity  
@Table(name= "mydb.employee")  
public class Employee {
	@EmbeddedId   
	private CompositeKey compositeKey;    
	private String name;    
	
	public CompositeKey getCompositeKey() {
		return compositeKey;
	}
	public void setCompositeKey(CompositeKey compositeKey) {
		this.compositeKey = compositeKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
