import java.util.function.Consumer;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day1.Student;

public class mycondemo {
    public static void main(String[] args) {
        /* (***)
        // noraml class use in 
        Consumer<String> c=new Myconsumer();
        c.accept("prince");
        // useing lamda exepresion:-
        Consumer<String> le= n -> System.out.println(n.toUpperCase());
        le.accept("raj Kumar"); 
         */
        Consumer<Student> s1=new Myconsumer();
        s1.accept(new Student(100, "prince kuamr", 110));
        // use lamda exepersion:---------
        Consumer<Student> le = s->{
            System.out.println(s.getroll_no());
            System.out.println(s.getname().toLowerCase());
        };
        le.accept(new Student(10, "PRINCE KUAMR", 100));


        //-----------*************************************************************************---------- */
        // use foreach in hrer:-------------------
        List<String> nameall= Arrays.asList("Prince","ashish","mohan","shonam");
        nameall.forEach(n->System.out.println(n.toUpperCase()));
        nameall.forEach(System.out::println);
    }
}
