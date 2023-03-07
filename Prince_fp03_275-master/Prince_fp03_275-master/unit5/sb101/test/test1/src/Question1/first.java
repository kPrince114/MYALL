package Question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// function programming :- it is a programming style where program are conducted by composing and appling functions that is beaking the problem into functions  
// Functional programming is designed to handle the symbolic computation and application processing list, and it is based on mathematical work
// function interface:- only on method in interface is called function interface here many dafault or static mathod
// it sort name is SAM and it is use to archive function programming;
public class first {

	public static void main(String[] args) {
		
		
		Predicate<bean> p= (e)->e.getQuantity()<5;
		
		System.out.println(p.test(new bean(2,"pant", 1000,40)));
		System.out.println(p.test(new bean(2,"shart", 100,2)));
		
		
		
		Consumer<bean> con=(e)->System.out.println(e);
		con.accept(new bean(2,"pen", 1000,40));
		
		
		Supplier<bean> supp=()->new bean(2,"copy", 10,20);
		System.out.println(supp.get());
		
		 
		Function<String,bean> fu=s->{
			String[] arr= s.split(",");
			
			return  new bean(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
			
		};
		
		System.out.println(fu.apply("1,Pen,20,100"));
		

	}

}
