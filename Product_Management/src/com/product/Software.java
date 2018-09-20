package com.product;

import java.util.Date;

public class Software extends Product {
	
	private String language;
	private String platform;
	
	
	public Software(int pid, String pname, Date mfd, String language, String platform) {
		super(pid, pname, mfd);
		this.language = language;
		this.platform = platform;
	}
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}


	@Override
	public String toString() {
		return "Software [language=" + language + ", platform=" + platform + "]";
	}
	
	

}
