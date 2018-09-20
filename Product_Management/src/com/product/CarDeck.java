package com.product;

import java.util.Date;

public class CarDeck extends MusicSystem{
	
	private String name;

	
	public CarDeck(int pid, String pname, Date mfd, int serviceId, String components, Dimension Dimension,
			double decibles, double powerAmplifier, String name) {
		super(pid, pname, mfd, serviceId, components, Dimension, decibles, powerAmplifier);
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
		return "CarDeck [name=" + name + "]";
	}
	
	

}
