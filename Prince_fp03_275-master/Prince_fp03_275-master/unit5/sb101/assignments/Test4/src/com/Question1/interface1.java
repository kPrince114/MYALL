package com.Question1;

public interface interface1 {
	public void createDepartment();
	public void createTableEmpoly();
	public String addNewDept(String name,String location);
	public String addWithDepID(String name,String address,String email,String password,int salary);
	public String loginEmp(int id,String email);
	public String printalldept();
	public String updatedept(String location,int id);
	public String updateEmpolyPassword(int id,int password);
	public String DeleteDept(int id);
}
