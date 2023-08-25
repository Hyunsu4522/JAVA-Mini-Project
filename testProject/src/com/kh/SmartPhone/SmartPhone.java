package com.kh.SmartPhone;

public class SmartPhone extends MobilePhone {
	protected String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
