package com.project.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Books {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int booId;
	@Column(name = "bookname")
	private String bookname;
	private String description;
	private double price;
	public int getBooId() {
		return booId;
	}
	public void setBooId(int booId) {
		this.booId = booId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Books(int booId, String bookname, String description, double price) {
		super();
		this.booId = booId;
		this.bookname = bookname;
		this.description = description;
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [booId=" + booId + ", bookname=" + bookname + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
}
