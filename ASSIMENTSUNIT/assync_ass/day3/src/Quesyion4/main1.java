package Quesyion4;

import java.util.*;
import java.util.stream.Collectors;

public class main1 {

	public static void main(String[] args) {
		Set<Student> t=new TreeSet<>(new sortMrk());
		t.add(new Student(1,"prince",200));
		t.add(new Student(1,"raj k",200));
		t.add(new Student(3,"prince k",100));
		t.add(new Student(9,"prince",900));
		t.add(new Student(7,"prince",100));
		Set<Student> t1=t.stream().filter(s->s.getMark()<500).collect(Collectors.toSet());
		
		t1.forEach(s->System.out.println(s));
	}

}
