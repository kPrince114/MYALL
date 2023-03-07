package com.masai.Q2.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Book Id : 101,
//name: "C++",
//author: "Nitesh",
//publication: "Rajput Publication",
//category: "Computer Programming",
//pages: 1500,
//price: 240,
//created_timestamp : 2019-12-11 10:58:37
@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private String author;
	private String publiction;
	private int page;
	private int price;
	private String date;
	public Book(int id, String name, String author, String publiction, int page, int price, String date) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publiction = publiction;
		this.page = page;
		this.price = price;
		this.date = date;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubliction() {
		return publiction;
	}
	public void setPubliction(String publiction) {
		this.publiction = publiction;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bean [id=" + id + ", name=" + name + ", author=" + author + ", publiction=" + publiction + ", page="
				+ page + ", price=" + price + ", date=" + date + "]";
	}

}
