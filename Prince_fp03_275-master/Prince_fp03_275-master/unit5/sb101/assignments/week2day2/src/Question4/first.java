package Question4;

import java.util.ArrayList;
import java.util.List;

//public class first {
//
//	List<String> list1=new ArrayList<>();
//	
//	public static void main(String[] args) {
//		first f=new first();
//		int p=0;
//		second s=new second();
//		s.start();
//		try {
//			s.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		// first fe to solve problem
//		//List<String> list=s.cli;
//		
//		s.cli.forEach(S->System.out.println(S));
//	}
//
//}
public class first {

	
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		second s=new second(list1);
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.cuList.forEach(S->System.out.println(S));
	}

}
