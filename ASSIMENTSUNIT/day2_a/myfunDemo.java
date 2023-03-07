import java.util.function.Function;

import day1.Student;

public class myfunDemo {
    public static void main(String[] args) {
        Function<Student,String> st = new myfun();
        String result = st.apply(new Student(100, "Prince", 1110));
        System.out.println(result);
        Function<Student, String> ls= (s) ->{
            return s.getmark()>300? "you are pass :--- "+s.getname():"you are not pass :---"+s.getname();
        };
        System.out.println(ls.apply(new Student(100, "Prince", 100)));
    }
}
