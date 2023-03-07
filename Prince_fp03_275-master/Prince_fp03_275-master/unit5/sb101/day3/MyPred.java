import java.util.function.Predicate;
import day1.Student;
public class MyPred implements Predicate<Student> {
    /* 
    // in interger use (***) 
    @Override
    public boolean test(Integer t) {
       
        return t>=0;
    // }
    */
    // here use in class
    @Override
    public boolean test(Student s){
        return s.getmark()>=200;
    }

   

}
