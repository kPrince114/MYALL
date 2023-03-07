package com.masai.Q1.MAIN;

import java.util.Scanner;

import com.masai.Q1.UniversityDAO.UniversityDAO;



public class main2 implements UniversityDAO {
	@Override
	public int getInstance(String dao) {
		if(dao.equals("jdbc")) {
			return 1;
		}
		else {
			return 2;
		}
	}

}
