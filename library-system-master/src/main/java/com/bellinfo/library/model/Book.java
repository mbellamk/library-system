package com.bellinfo.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.*;
@Entity
@Table(name="BOOK")
public class Book implements Comparable<Book>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ID")
	private int bookId;
	
	@NotNull
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="BOOK_NAME", nullable=false)
	private String bookName;
	
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="BOOK_AUTHOR")
	private String bookAuthor ;
	
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="BOOK_PUBLISHER")
	private String bookPublisher ;
	
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="BOOK_CATEGORY")
	private String bookCategory ;
	
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="BOOK_ISBN")
	private String bookIsbn ;
	
	@Column(name="TOTALCOPIES" ,nullable=false)
	private int totalCopies;
	
	@Column(name="AVAILABLECOPIES")
	private int availableCopies;
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}


	

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	@Override
	public int compareTo(Book o) {
		int result=getBookId()-o.getBookId();
		return result;
	}

	@Override
	public String toString() {
		return "Book [id=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublisher="
				+ bookPublisher + ", bookCategory=" + bookCategory + ", bookIsbn=" + bookIsbn + ", TotalCopies="
				+ totalCopies + ", AvailableCopies=" + availableCopies + "]";
	}

}	
	
