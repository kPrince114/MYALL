package com.masai.Q2.Dao;
import com.masai.Q2.bean.Book;
import com.masai.Q2.bean.BookExecption;
import com.masai.Q2.utily.utily;

import jakarta.persistence.EntityManager;

public class implementinterface implements interfaceAll {

	@Override
	public Book getInformation(int id) {
		EntityManager em = utily.privideEntityManager();
		Book stu = em.find(Book.class, id);
		if(stu==null) {
			throw new BookExecption("some error");
		}
		else {
			return stu;
		}
	}

	@Override
	public String createnewBook(Book book) {
		EntityManager em = utily.privideEntityManager();

		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		return "Done";
	}

	@Override
	public String deleteBookById(int id) {
		EntityManager em = utily.privideEntityManager();
		Book stu = em.find(Book.class, id);
		if(stu==null) {
			throw new BookExecption("some error");
		}
		else {
			em.getTransaction().begin();
			em.remove(stu);
			em.getTransaction().commit();
			return "delete sucessfully";
		}
	}

	@Override
	public String updatePriceById(int id, int price) {
	
		EntityManager em = utily.privideEntityManager();
		Book stu = em.find(Book.class, id);
		if(stu==null) {
			throw new BookExecption("some error");
		}
		else {
			em.getTransaction().begin();
			stu.setPrice(price);
			em.getTransaction().commit();
			return "Update  sucessfully";
		}
	}

}
