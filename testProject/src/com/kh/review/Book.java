package com.kh.review;

//Book 객체를 만들기 위한 class.
public class Book {
	private int key; //사람을 식별할 수 있는 key 
	private String title;
	private String author;
	private int code;
	private boolean isRent;
	
	public Book(String title, String author, int code) {
		this.title = title;
		this.author = author;
		this.code = code;
		this.isRent = true;
	}
	
	public boolean getIsRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
	}




	@Override
	public String toString() {
		return this.code + "\t" + this.title + "\t" + this.author + "\t" + (this.isRent ? "대여가능":"대여불가");
	}
	
}
