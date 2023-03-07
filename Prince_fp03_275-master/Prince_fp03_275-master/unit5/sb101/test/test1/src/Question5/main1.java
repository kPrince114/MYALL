package Question5;

import Question2.Student;

/*
What do you mean by Method Reference, How to refer static method, non-static method and constructor, implement the following interface using Method reference using static method, non-static method and constructor example:

def:-Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface
we can replace expression with method reference (:: operator);


method reference of non-static;-obj::methodname;
static:- classname:methodname;
constructor:- classname:new 

constructor not any  return type;



*/


public class main1 {
	
	public main1(Student st) {
		new Student(1,"prince",700,"sabalpur");
		System.out.println(st);
	}
	public static void st(Student st) {
		
		System.out.println(st);
		System.out.println("i am static methos");
	}
	public void ns(Student st) {
		
		System.out.println("non statis");
		System.out.println("i am non satic method ");
	}
	public main1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService i1=main1::new;
		Student s=new Student(1,"prince",700,"sabalpur");
		i1.printStudentDetails(s);
		
		
		StudentService i2= main1::st;
		i2.printStudentDetails(s);
		
		StudentService i3=new main1()::ns;
		i3.printStudentDetails(s);
		
		

	}
	

}
