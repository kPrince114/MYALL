package com.masai.Q3.Dao;



import com.masai.Q2.bean.Book;
import com.masai.Q2.bean.BookExecption;
import com.masai.Q3.utily.utily;
import com.masai.Q3.bean.Courier;
import com.masai.Q3.bean.CourierExecption;

import jakarta.persistence.EntityManager;

public class implall implements interfaceAll {

	@Override
	public Courier getInfById(int id) {
		EntityManager em = utily.privideEntityManager();
		Courier cou = em.find(Courier.class, id);
		if(cou==null) {
			throw new CourierExecption("some error");
		}
		else {
			return cou;
		}
	}

	@Override
	public String createnewShipment(Courier c) {
		EntityManager em = utily.privideEntityManager();

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return "Done";
	}

	@Override
	public String deletecou(int id) {
		EntityManager em = utily.privideEntityManager();
		Courier cu = em.find(Courier.class, id);
		if(cu==null) {
			throw new CourierExecption("some error ");
		}
		else {
			em.getTransaction().begin();
			em.remove(cu);
			em.getTransaction().commit();
			return "delete sucessfully";
		}
	}

	@Override
	public String updateCou(int id, String content, String address) {
		EntityManager em = utily.privideEntityManager();
		Courier cu = em.find(Courier.class, id);
		if(cu==null) {
			throw new CourierExecption("some error");
		}
		else {
			em.getTransaction().begin();
			cu.setContent(content);
			cu.setSenderAddress(address);
			em.getTransaction().commit();
			return "Update  sucessfully";
		}
	}

	

	

}
