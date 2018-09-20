package com.product;

import java.util.Date;

abstract public class Product {
	
	private int pid;
	private String pname;
	private Date mfd;
	
		
	public Product(int pid, String pname, Date mfd) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mfd = mfd;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getMfd() {
		return mfd;
	}
	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}


	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", mfd=" + mfd + "]";
	}
	
	
}
