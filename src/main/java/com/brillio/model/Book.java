package com.brillio.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class Book {
	
	
	@org.springframework.data.annotation.Id

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private Double bookPrice;
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
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	

}
