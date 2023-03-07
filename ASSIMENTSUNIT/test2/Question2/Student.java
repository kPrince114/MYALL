package Question2;

public class Student {
    int roll_no;
    String name;
    int mark;
    String Address;

    public Student(int roll_no, String name, int mark,String Address) {
        
        this.roll_no = roll_no;
        this.name = name;
        this.mark = mark;
        this.Address=Address;
    }


    @Override
    public String toString() {
        return "Student:- {" + " mark is " + mark + ", name " + name + ", roll_no " + roll_no + "}";
    }
}
