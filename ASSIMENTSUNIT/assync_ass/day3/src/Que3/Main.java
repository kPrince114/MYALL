package Que3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//Create a List of 5 Student objects and from that List get the highest marks
//Student by using Stream API.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Student> list = new ArrayList<>();
		  list.add(new Student(1,"Shobha Kumari", 580));
		  list.add(new Student(2,"Rishav Kumar", 740));
		  list.add(new Student(3,"Prince Kumar", 830));
		  list.add(new Student(4,"Alka Sinha", 680));
		  list.add(new Student(9,"Chetan Borkar", 970));
      
			
//
//			Optional<Student> opt= students.stream().max((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1: -1);
//			
//			Student student= opt.get();
//			
//			System.out.println(student)
			
			//Optional<Student> opt = list.stream().max((s1,s2 )-> s1.getMarks()>s2.getMarks()? +1:-1);
//			Student student= opt.get();
//			System.out.println(student);
	}

}
