package com.kh.hw.shape;

public class Shape {
	private int type ; 
	private double height; 
	private double width; 
	private String color;
	
	public Shape() {
		color = "white";
	}
	
	public Shape(int type, double height, double width) {
		this(); //기본생성자
		this.type = type;
		this.height = height;
		this.width = width;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public String information() {
        return " " + height + " " + width + " " + color;
    }

}
 