package Empolyall;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empoly {
	@Id
	private int empId;
	private String name;
	private String address;
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Empoly(int empId, String name, String address, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public Empoly() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empoly [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
//empId: int primary key
//name: varchar not null
//address: varchar not null
//salary: int not null