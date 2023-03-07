package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques2 {
    public static void main(String[] args) {
        
        ArrayList<Student> lst=new ArrayList<>();

        lst.add(new Student(10, "prince", 100));
        lst.add(new Student(12, "raj", 300));
        lst.add(new Student(11, "sohan", 200));
        lst.add(new Student(14, "mohan", 500));
        lst.add(new Student(13, "rohan", 150));
        //Stream<Student> st=lst.stream();//Another ways to a variable
        List<Student> ls=lst.stream().sorted((p1, p2)->{
            if(p1.getmark()>p2.getmark()){
                return 1;
            }
            else if(p1.getmark()<p2.getmark()){
                return -1;
            }
            return 0;
           }
           ).collect(Collectors.toList());
           // short form
        //    List<Student> ls1=lst.stream().sorted((p1, p2)->(p1.getmark()>p2.getmark()? +1 :-1)).collect(Collectors.toList());


        ls.forEach(e->System.out.println(e));
    }
}
