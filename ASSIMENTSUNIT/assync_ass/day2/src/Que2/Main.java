package Que2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void printSomething(Student student) {
		System.out.println(student);
	}
	
	public void someMethod(Student student) {
		
		System.out.println(student);
	}
	
	public Main() {
		
	}
	// Using Constructor
	public Main(Student student) {
		
		System.out.println(student);
	}
	
     public static void main(String[] args) {
        Student s = new Student(1,"Shobha Kumari", 100);
       
		Demo stu1 = Main ::printSomething;
		stu1.printDetail(s);
		
		System.out.println("*-*****************************");
		
		Demo stu2 = Main :: new;
		stu2.printDetail(s);
		
		System.out.println("*-*****************************");
		
		Demo stu3 = new Main()::someMethod;
		stu3.printDetail(s);
		
		
		
		
		
		
		
		
	}

}
