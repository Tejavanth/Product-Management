package com.product;

import java.util.Date;

public class Laptop extends Computer {
	
	private String name;

	
	public Laptop(int pid, String pname, Date mfd, int serviceId, String components, com.product.Dimension Dimension,
			int RAM, int harddisk, String name) {
		super(pid, pname, mfd, serviceId, components, Dimension, RAM, harddisk);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + "]";
	}
	
	
	

}
