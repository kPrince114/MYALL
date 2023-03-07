package Que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Product> list = new ArrayList<>();
       
         list.add(new Product(1,"Pen",599,90));
         list.add(new Product(2,"Pencil",399,12));
        list.add(new Product(3,"Copy",699,7));
        list.add(new Product(4,"Sharpner",899,6));
        list.add(new Product(5,"Eraser",799,800));
       
       List<Product> l1 =new ArrayList<>();
       list.forEach((l)->{
    	  if(l.getQuantity()>10) {
    		  l1.add(l);
    	  }
    	  
       });
       l1.forEach((l)->System.out.println(l));
       
       System.out.println("==================third question===================");
       
       Collections.sort(list , new PriceComp());
       
      //Collections.sort(list, (s1,s2) -> s1.getPrice() > s2.getPrice() ?-1 :+1 );
		
       list.forEach(p -> System.out.println(p));
       
       System.out.println("==================fourth question===================");
       
       list.stream().filter(s ->s.getQuantity()>10).forEach(s -> System.out.println(s)); // 1 problem pending
       
       System.out.println("===============================");
       
       list.stream().forEach(s ->System.out.println(s));
       
       
	}

}
