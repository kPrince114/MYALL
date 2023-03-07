package com.Question4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Empoly> li=new ArrayList<>();
		li.add(new Empoly(12,"prince",20000,"abc@gamil.com","123",new Address("bihar","patna","3000009")));
		li.add(new Empoly(13,"raj kumar",50000,"def@gamil.com","111",new Address("up","varansi","5000009")));
		li.add(new Empoly(14,"ram kumar",60000,"ghi@gamil.com","3333",new Address("delhi","mokam","9000010")));
		li.add(new Empoly(15,"mohan kumar",10000,"jkl@gamil.com","49443",new Address("Bihar","gaya","30000029")));
		li.add(new Empoly(16,"sohan kumar",14000,"xyx@gamil.com","2337",new Address("bihar","musapparpur","4000383")));
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
		os.writeObject(li);
		os.close();
		System.out.println("done...");
		
	}
	

}
