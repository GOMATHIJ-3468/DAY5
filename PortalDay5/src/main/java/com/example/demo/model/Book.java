package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookStore")
public class Book {

	@Id
	private int id;
	private String bookname;
	private float price;
	private int quantity;
	private String Authorname;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookname, float price, int quantity, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		Authorname = authorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	
}
