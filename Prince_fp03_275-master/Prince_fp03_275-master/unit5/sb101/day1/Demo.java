package day1;
import java.util.*;
public class Demo {
    // private static final String Student = null;

    public static void main(String[] args) {
        List<Student> st=new ArrayList<Student>();
        st.add(new Student(1, "prince", 10));
        st.add(new Student(2, "prince", 11));
        st.add(new Student(3, "prince", 13));
        st.add(new Student(4, "prince", 14));
        st.add(new Student(5, "prince", 15));
        System.out.println(st);
        // Collections.sort(st,new Mymark());
        
    }
    
}
