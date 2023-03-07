package com.masai.Q1.UniversityDAO;

import com.masai.Q1.Execption.StudentExecption;

public interface INTERFACEJDBC {
	public String deleteStudentById(int id) throws StudentExecption;
	public String updateStudentCGPA(int id, int cgpa)throws StudentExecption; ;
	
}
