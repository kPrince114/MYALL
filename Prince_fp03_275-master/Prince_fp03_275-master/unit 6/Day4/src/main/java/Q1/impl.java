package Q1;

import jakarta.persistence.EntityManager;

public class impl implements interface1 {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		EntityManager em = util.privideEntityManager();
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManager em = util.privideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		if(emp==null) {
			throw new EmployeeException("empole is not there in this id");
		}
		else {
			return emp;
		}
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em = util.privideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		if(emp==null) {
			throw new EmployeeException("delect  this empoly");
		}
		else {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			return emp;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManager em = util.privideEntityManager();
		Employee emp = em.find(Employee.class, employee.getId());
		if(emp==null) {
			throw new EmployeeException("enter coreect empoly id ");
		}
		else {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
			return employee;
		}
	}

}
