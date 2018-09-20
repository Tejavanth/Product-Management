package com.product;

public class Dimension {

	private double length;
	private double heigth;
	private double width;
	
	
	public Dimension(double length, double heigth, double width) {
		super();
		this.length = length;
		this.heigth = heigth;
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public String toString() {
		return "Dimension [length=" + length + ", heigth=" + heigth + ", width=" + width + "]";
	}
	
	
	
}
