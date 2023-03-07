import java.util.function.Supplier;

import day1.Student;

public class mysuppDemo {
    public static int mai(){
        return 1000;
    }
    public static void main(String[] args) {
        
        Supplier<String> ss=new mysuppiler();
        System.out.println(ss.get());
        
        Supplier<String> ls= () ->{
            return "my name is lemda in use supplier";
        };
        ls.get();
        Supplier<Student> cs=()-> new Student(100, "prince luamr i s", 340);
        System.out.println(cs.get());
        cs.get();
            Supplier<Integer> rfi=mysuppDemo::mai;
         System.out.println(rfi.get());
            
    }
    
}
