import java.util.function.Consumer;
import day1.Student;
public class Myconsumer implements Consumer<Student> {

    @Override
    public void accept(Student s) {
       System.out.println(s.getmark());
       System.out.println(s.getname().toUpperCase());
        
    }
    /* // only accept String(***)
    @Override
    public void accept(String name) {
       System.out.println("name is convert upercase:---"+name.toUpperCase());
        
    }
    */
    
    
}
