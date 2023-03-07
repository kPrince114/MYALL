import day1.Student;
public class MethodRefer {

    // only interger;
    public static Boolean CheckResult(int mark){
        return mark >200;
    }
    // use Student class in 
    public static Boolean CheckStudentMark(Student s){
        return s.getmark()>=200;
    }
}
