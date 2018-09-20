package com.product;

import java.util.Date;

public class Computer extends Hardware {
	
	private int RAM;
	private int harddisk;
	
	
	public Computer(int pid, String pname, java.util.Date mfd, int serviceId, String components, Dimension Dimension, int RAM, int harddisk) {
		super(pid, pname, mfd, serviceId, components, Dimension);
		this.RAM = RAM;
		this.harddisk = harddisk;
		
	}

	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}


	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", harddisk=" + harddisk + "]";
	}
	

}
