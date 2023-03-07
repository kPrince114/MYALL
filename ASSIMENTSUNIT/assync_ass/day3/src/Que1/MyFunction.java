package Que1;

import java.util.function.Function;

public class MyFunction implements Function<Student,String> {

	@Override
	public String apply(Student t) {
		// TODO Auto-generated method stub
//		if(t.getMarks()>500) {
//			return "Pass";
//		}else {
//			return "fail";
//		}
		return t.getMarks()>500?"Pass":"Fail";
	}

}
