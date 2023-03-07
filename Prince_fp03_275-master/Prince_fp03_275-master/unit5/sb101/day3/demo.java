import java.util.*;
import java.util.function.Predicate;
import day1.Student;
public class demo {
    public static void main(String[] args) {
        /* (***)
        // normal Class;
        Predicate<Integer>p1=new MyPred();
        System.out.println(p1.test(-30));
        // Lemda class
        Predicate<Integer> p2=i->i>=0;
        System.out.println(p2.test(20));
        //Method Reference use in class;
        Predicate<Integer> p3=MethodRefer::CheckResult;
        System.out.println(p3.test(200));
        */
        Predicate<Student> s1=new MyPred();
        /* // normal Method  not short code
        Student s2=new Student(1, "pr", 10);
        boolean result=s1.test(s2);
        System.out.println(result);
        */
        // normal Method short code
        System.out.println(s1.test(new Student(10, "prince", 200)));
        // useing lemda Exepresion;
        Predicate<Student> le1 = s->s.getmark()>200;
        System.out.println(le1.test(new Student(10, "prince Raj", 300)));
        // useing method reference;
        Predicate<Student> mr=MethodRefer::CheckStudentMark;
        System.out.println(mr.test(new Student(10, "prince Raj", 100)));
        // use removeif use in predicate
        List<Student> list=new ArrayList<>();
        list.add(new Student(10, "class10", 100));
        list.add(new Student(10, "class10", 200));
        list.add(new Student(10, "class10", 300));
        list.add(new Student(10, "class10", 400));
        list.add(new Student(10, "class10", 500));
        list.removeIf(s -> s.getmark()>=500);
       System.out.println(list);



        
        

    }
}
