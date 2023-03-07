package day1;
public class intrimpl implements intr {

    @Override
    public Student getStudent(int roll, String name, int mark) {
        // Student s1=new Student(1, "prince kumar", 100);
        // return s1;
        //   0R(save one variable);
        return new Student(roll, name, mark);
    }

    //@Override
    // public String sayhello(String name) {
    //     return  name;
        
    // }

    
}
