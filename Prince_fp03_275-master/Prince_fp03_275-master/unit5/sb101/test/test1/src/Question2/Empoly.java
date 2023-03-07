package Question2;
//empId,
//name,
//salary,
//address

public class Empoly {
	private int id;
	private String name;
	private int salary;
	private String address;
	public Empoly() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empoly(int id, String name, int salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Empoly [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	

}
