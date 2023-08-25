package com.kh.practice.point;

public class Rectangle extends  Point{
	int width, height;
	public Rectangle() {
		super();
		this.width = 0;
		this.height = 0;
	}
	public Rectangle(int x, int y, int width ,int height) {
		super(x , y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " " + height + " " + width; 
	}

	
}
