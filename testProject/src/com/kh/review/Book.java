package com.kh.review;

public class Book {
	String title;
	
	Book(String title){
		this.title = title;
	}
	String getTitle() {
		return this.title;
	}
	void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
	
}
