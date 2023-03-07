package day3;

// import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// import java.util.TreeSet;
import java.util.stream.Collectors;

public class Questo4 {
    public static void main(String[] args) {
        Set<Student> lst=new HashSet<>();
        lst.add(new Student(10, "prince", 100));
        lst.add(new Student(12, "raj", 300));
        lst.add(new Student(11, "sohan", 200));
        lst.add(new Student(14, "mohan", 500));
        lst.add(new Student(13, "rohan", 650));
        Set<Student> ls1=lst.stream().filter(e->e.getmark()<500).collect(Collectors.toSet());
        System.out.println(ls1);
        
    }
    
}
