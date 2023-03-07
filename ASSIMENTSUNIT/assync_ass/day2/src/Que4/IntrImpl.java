package Que4;

import java.util.ArrayList;
import java.util.List;

public class IntrImpl {

	public List<Student>studentList(List<Student> list){
		
		List<Student> list1 = new ArrayList<>();
		
		list.forEach((s)-> {
			if(s.getMarks()<500) {
				list1.add(new Student(s.getRoll(),s.getName(),s.getMarks()));
			}
		});
		
		return list1;
	}
	
}
