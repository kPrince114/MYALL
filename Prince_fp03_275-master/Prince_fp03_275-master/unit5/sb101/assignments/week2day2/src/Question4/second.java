package Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class  second  extends Thread{
////	=new ArrayList<>();
//	first f=new first();
//	List<String> cli =f.list1;
//	@Override
//	public synchronized  void  run() {
//		System.out.println("start my fun");
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			System.out.println("Enter your "+i+ " city");
//			cli.add(sc.next());
//		}
//		
//	}
//
//}
public class  second  extends Thread{
	List<String> cuList;
	second(List<String> cuList){
		this.cuList=cuList;
	}
	first f=new first();
	@Override
	public synchronized  void  run() {
		System.out.println("start my fun");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter your "+i+ " city");
			cuList.add(sc.next());
		}
		
	}

}
