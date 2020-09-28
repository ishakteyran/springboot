package com.dealark.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees",schema="warehouse")
public class Employee extends EntityPrivateKey{
	
	private String name;
	private String password;
		
	public Employee(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
