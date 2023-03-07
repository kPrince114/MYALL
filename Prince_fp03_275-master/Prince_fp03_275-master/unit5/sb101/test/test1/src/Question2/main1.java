package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main1 {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"prince",700,"sabalpur"));
		l.add(new Student(2,"raj",100,"delhi"));
		l.add(new Student(3,"mohan",3,"bihar"));
		l.add(new Student(4,"ram",2,"mohanpur"));
		l.add(new Student(5,"yesh",40,"rampur"));
		List<Empoly> emp=l.stream().filter(s->s.getMark()>500).map(s->new Empoly(s.getId(),s.getName(),s.getMark(),s.getAddress())).collect(Collectors.toList());
		
		emp.sort(new Comparator<Empoly>() {

			@Override
			public int compare(Empoly o1, Empoly o2) {
				if(o1.getSalary()<o2.getSalary()) {
					return 1;
				}
				else if(o1.getSalary()>o2.getSalary()) {
					return -1;
				}
				else {
					return 0;
				}
				
			}
			
		});
		
		emp.forEach(s->System.out.println(s));
	l.forEach(s->System.out.println(s));
		
		
		
		
		

	}

}
