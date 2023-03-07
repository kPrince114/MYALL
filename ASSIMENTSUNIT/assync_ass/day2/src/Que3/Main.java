package Que3;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list = new ArrayList<>();
     list.add("Patna");
     list.add("Indore");
     list.add("Chennai");
     list.add("Banglore");
     list.add("Chennai");
     
     list.forEach((n)->System.out.println(n.toUpperCase()));  
  	
	}

}
