package Que1;

import java.util.function.Supplier;

public class MySupplier implements Supplier<Student>{

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Chetan Borkar",990);
		return s;
	}

}
