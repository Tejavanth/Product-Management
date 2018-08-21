package com.bean;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String address; // has-a relationship
	private Date doj;

	public Employee() {
		
	}

	public Employee(int id, String name, String email, String address, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.doj = doj;
	}

	// getter and setter methods
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", doj=" + doj
				+ "]";
	}

}
