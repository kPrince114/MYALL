package com.Question4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("employeedata.txt")) ;
		List<Empoly> pemp=(List<Empoly>) oi.readObject();
		pemp.forEach(System.out::println);
		pemp.add(new Empoly(122,"priya kumari",45000,"priya@gamil.com","priya2123",new Address("bihar","patna","800019")));
		ObjectOutputStream si=new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
		si.writeObject(pemp);
		si.close();
		System.out.println("done...........");
		

	}

}
