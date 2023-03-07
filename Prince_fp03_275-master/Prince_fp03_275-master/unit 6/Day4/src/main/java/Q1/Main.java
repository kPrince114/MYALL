package Q1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		impl em = new impl();
		Employee e1 = new Employee();
		e1.setAddress("patna");
		e1.setName("raj Kumar");
		e1.setSalary(4000);
		System.out.println("Enter your numer ");
		int num = sc.nextInt();
		if (num == 1) {
			try {
				Employee em2 = em.registerEmployee(e1);
				System.out.println(em2);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
				;
			}
		} 
		else if (num == 2) {
			try {
				Employee em2 = em.getEmployeeById(e1.getId());
				System.out.println(em2);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
				;
			}

		}
		else if(num==3) {
			try {
				Employee em2 = em.deleteEmployeeById(e1.getId());
				System.out.println(em2);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
				;
			}
		}
		else if(num==4) {
			System.out.println(" enter  your id");
			int id=sc.nextInt();
			e1.setId(id);
			try {
				Employee em2 = em.updateEmployee(e1);
				System.out.println(em2);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
				;
			}
		}

	}
}
