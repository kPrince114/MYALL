package com.masai.Q1.UniversityDAO;

import com.masai.Q1.Execption.StudentExecption;
import com.masai.Q1.bean.Student;
import com.masai.Q1.common.EMUtil;

import jakarta.persistence.EntityManager;

public class implemenorm implements INERDFACEORM {

	@Override
	public Student findStudentById(int id) throws StudentExecption {
		EntityManager em = EMUtil.privideEntityManager();
		Student stu = em.find(Student.class, id);
		if(stu==null) {
			throw new StudentExecption("Account is not there in this id");
		}
		else {
			return stu;
		}
		
	}

	@Override
	public String saveStudent(Student student) {
		EntityManager em = EMUtil.privideEntityManager();

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		return "Done";
	}

	

	

}
