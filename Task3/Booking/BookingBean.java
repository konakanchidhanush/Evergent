package com.evergent.CoreJAVA.Booking;
import java.io.Serializable;

public class BookingBean implements Serializable {
	private String title;
	private int members;
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	private String grade;
	private int bookId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}
