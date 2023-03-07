package com.masai.Q1.UniversityDAO;

import com.masai.Q1.Execption.StudentExecption;
import com.masai.Q1.bean.Student;

public interface INERDFACEORM {
	public Student findStudentById(int id) throws StudentExecption;
	public String saveStudent(Student student);

}
