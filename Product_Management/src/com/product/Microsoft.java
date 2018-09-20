package com.product;

import java.util.Date;

public class Microsoft extends Software{

	private double version;
	private double price;
	
	
	public Microsoft(int pid, String pname, Date mfd, String language, String platform, double version, double price) {
		super(pid, pname, mfd, language, platform);
		this.price = price;
		this.version = version;
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
		return "Microsoft [version=" + version + ", price=" + price + "]";
	}
	
	
}
