package Quesyion4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first {

	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(1,4,5,7,8);
		List<Integer> l2=l1.stream().map(s->s*s).collect(Collectors.toList());
		// previes list
		l1.forEach(s->System.out.println(s));
		System.out.println("************************************");
		// updated list (according to Question);
		l2.forEach(s->System.out.println(s));
		
		
		

	}

}
