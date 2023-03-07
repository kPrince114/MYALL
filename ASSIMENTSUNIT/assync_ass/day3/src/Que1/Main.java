package Que1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Predicate<Student> p1 = new MyPredicate();
		System.out.println(p1.test(new Student(1,"Prince Kumar",990)));
		System.out.println(p1.test(new Student(1,"Prince Kumar",440)));
	
		System.out.println("====================================");
	    Consumer<Student> c1 = new MyConsumer();
	    c1.accept(new Student(1,"Rishav Kumar",898));
	    
	    System.out.println("====================================");
	    Supplier<Student> s1 = new MySupplier();
	    System.out.println(s1.get());
	    
	    System.out.println("====================================");
	    Function<Student, String> f1 = new MyFunction();
//        System.out.println(f1.apply());
	   String bag =  f1.apply(new Student(5,"Roushan",898));
	    
	    System.out.println(bag);
	    
	    
	}

}
