package Que4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static List<Student> findStudentList(List<Student> stu){
		
		List<Student> student = new ArrayList<>();
		
		stu.forEach((s) ->{
			if(s.getMarks()<500) {
				student.add(new Student(s.getRoll(),s.getName(),s.getMarks()));
			}
		});
		
		return student;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Shobha Kumari", 580));
		list.add(new Student(2,"Rishav Kumar", 740));
		list.add(new Student(3,"Prince Kumar", 830));
		list.add(new Student(4,"Alka Sinha", 680));
		list.add(new Student(5,"Rohit Kumar",330 ));
		list.add(new Student(6,"Pramod Kumar", 258));
		list.add(new Student(7,"Roushan Kumar", 990));
		list.add(new Student(8,"Robin Kumar", 450));
		list.add(new Student(9,"Navnit Kumar", 460));
		list.add(new Student(9,"Chetan Borkar", 970));
		
		
		// Using NonStatic Method Reference
		Intr i1 = new IntrImpl()::studentList;
		List<Student> list2 = i1.findStudent(list);
		list2.forEach((l)-> System.out.println(l));
		
		System.out.println("===================================================");
		
		// Using Static Method Reference
		Intr i2 = Main::findStudentList;
		List<Student> list3 = i2.findStudent(list);
		list3.forEach((l)-> System.out.println(l));
		

		
	}

	
}
