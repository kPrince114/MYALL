import java.util.function.Function;
import day1.Student;
public class myfun implements Function<Student , String> {

    @Override
    public String apply(Student s) {

        return s.getmark()>300? "you are pass :--- "+s.getname():"you are not pass :---"+s.getname();
    }
    
}
