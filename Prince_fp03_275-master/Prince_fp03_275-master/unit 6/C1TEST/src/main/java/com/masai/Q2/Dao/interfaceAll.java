package com.masai.Q2.Dao;

import com.masai.Q2.bean.Book;

public interface interfaceAll {
//	- Get the information of any particular book by id**
//	- **Create a new Book**
//	- **Delete Book by ID**
//	- **Update Book by ID by doubling the price**
	public Book getInformation(int id);
	public String createnewBook(Book book);
	public String deleteBookById(int id);
	public String updatePriceById(int id,int price);
}
