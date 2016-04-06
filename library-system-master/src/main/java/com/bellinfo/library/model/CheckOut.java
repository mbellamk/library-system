package com.bellinfo.library.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CHECKOUT")
public class CheckOut implements Comparable<CheckOut> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="P_ID")
	private int pId;
	
	@Column(name="BOOK_ID", nullable=false)
	private int bookId;
	
	@Column(name="STUDENT_ID", nullable=false)
	private int studentId;
	
	@Column(name="BOOK_NAME", nullable=false)
	private String bookName;
	
	@Column(name="CHECKOUT_DATE", nullable=false)
	private String checkoutDate;
	
	@Column(name="RETURN_DATE")
	private String returnDate;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		 checkoutDate = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		 System.out.println(checkoutDate);
		this.checkoutDate = checkoutDate;
	}
	
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		Date d= new Date();
		d.setTime(d.getTime() + 30L * 24 * 60 * 60 * 1000);
		returnDate = new SimpleDateFormat("MM-dd-yyyy").format(d);
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "CheckOut [bookId=" + bookId + ", studentId=" + studentId
				+ ", bookName=" + bookName + ", checkoutDate=" + checkoutDate
				+ ", returnDate=" + returnDate + "]";
	}
	@Override
	public int compareTo(CheckOut o) {
		Integer i1= new Integer(bookId);
		Integer i2= new Integer(o.getBookId());
		return i1.compareTo(i2);
		
		
	}
	
	
	
	
}
