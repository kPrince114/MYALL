package day1;

public class Student {
    private int roll_no;
    private String name;
    private int mark;
    public Student(int roll_no, String name,int mark){
        this.roll_no=roll_no;
        this.name=name;
        this.mark=mark;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setmark(int mark){
        this.mark=mark;
    }
    public int getmark(){
        return mark;
    }
    public void setroll_no(int roll_no){
        this.roll_no=roll_no;
    }
    public int getroll_no(){
        return roll_no;
    }
    @Override
    public String toString(){
        return "Student:- {"+" mark is "+ mark +", name "+ name +", roll_no "+ roll_no +"}";
    }
}
