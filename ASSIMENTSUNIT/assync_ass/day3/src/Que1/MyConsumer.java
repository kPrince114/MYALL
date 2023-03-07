package Que1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}

}
