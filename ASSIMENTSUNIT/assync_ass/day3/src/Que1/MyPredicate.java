package Que1;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student> {

	@Override
	public boolean test(Student s) {
		// TODO Auto-generated method stub
		return s.getMarks()>500;
	}

}
