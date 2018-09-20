package com.product;

import java.util.Date;

public class Tally extends Software{
	
	private double version;
	private double price;
	
	
	public Tally(int pid, String pname, Date mfd, String language, String platform, double price, double version) {
		super(pid, pname, mfd, language, platform);
		this.version = version;
		this.price = price;
	}
	
	
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Tally [version=" + version + ", price=" + price + "]";
	}
	
	

}
