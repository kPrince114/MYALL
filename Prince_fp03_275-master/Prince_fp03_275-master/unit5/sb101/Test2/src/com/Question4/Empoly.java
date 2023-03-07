package com.Question4;

import java.io.Serializable;

/*empId: int
empName: String
salary: int
email: String
password: String
address: Address //has-A relationship
*/
public class Empoly implements Serializable {
	private int empId;
	private String empName;
	private int salary;
	private String email;
	private String password;
	private Address address;
	

	public Empoly(int empId, String empName, int salary, String email, String password, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public Empoly() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Empoly [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
	}
	

}
