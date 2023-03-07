package com.Question3;
//import java.util.List;
import java.util.concurrent.*;
//import java.util.stream.Collectors;
import com.Question2.Student;
interface callble{  
	Empoly call(Student l);
} 
public class Main {
	public static Empoly xFun(Student l) {
		if(l.getMarks()>300 && l.getMarks()<500) {
			Empoly e=new Empoly(l.getRoll(),l.getName());
			return e;
		}
		else {
			return null;
		}
	
		
	}
	public static void main(String[] args) throws Exception {
		Student[] jobs = {new Student(27,"prince",400),new Student(27,"prince",360),new Student(27,"prince",600),new Student(27,"prince",100),
				new Student(27,"prince",270)};
		Main m=new Main();

		for(Student job:jobs) {
			callble callabl = Main::xFun;
		    try {
		      System.out.println(callabl.call(job));
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
			
		}

}
}

