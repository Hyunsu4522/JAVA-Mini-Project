package com.kh.javah;

public class Book {
	//필드
	private String bookclass;//책분류
	private int bookcode;//책분류코드
	private String bookregist;//등록날짜
	private String bookname;//책이름

	//생성자
	public Book(String bookclass, int bookcode, String bookregist, String bookname) {
		this.bookclass = bookclass;
		this.bookcode = bookcode;
		this.bookregist = bookregist;
		this.bookname = bookname;
	}
	
	//매서드
	//getter
	public String getBookclass() {
		return bookclass;
	}
	public int getBookcode() {
		return bookcode;
	}
	public String getBookregist() {
		return bookregist;
	}
	public String getBookname() {
		return bookname;
	}
	
	//setter
	public void setBookclass(String bookclass) {
		this.bookclass = bookclass;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public void setBookregist(String bookregist) {
		this.bookregist = bookregist;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	//정보를 반환해주는 toString 매서드
	public String toString() {
		String str = this.bookclass + "\t" + this.bookcode + "\t" +
					this.bookregist + "\t" + this.bookname+ "\n";
		return str;
	}	
	public boolean nameCheck(String bookname) {
		return(this.bookname.equals(bookname));
	}
	
	
}
