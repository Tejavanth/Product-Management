package com.product;

import java.util.Date;

public class MusicSystem extends Hardware {
	
	private double decibles;
	private double powerAmpifier;
	
	
	public MusicSystem(int pid, String pname, Date mfd, int serviceId, String components, Dimension Dimension, double decibles,  double powerAmpifier) {
		super(pid, pname, mfd, serviceId, components, Dimension);
		this.decibles = decibles;
		this.powerAmpifier = powerAmpifier;
	}
	
	
	public double getDecibles() {
		return decibles;
	}
	public void setDecibles(double decibles) {
		this.decibles = decibles;
	}
	public double getPowerAmpifier() {
		return powerAmpifier;
	}
	public void setPowerAmpifier(double powerAmpifier) {
		this.powerAmpifier = powerAmpifier;
	}


	@Override
	public String toString() {
		return "MusicSystem [decibles=" + decibles + ", powerAmpifier=" + powerAmpifier + "]";
	} 
	

}
