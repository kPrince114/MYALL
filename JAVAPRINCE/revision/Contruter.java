
class MyMainEmployee{
    public int id;
    private String name;
    /* 
    1. Remember: Does constructor return any value?:----
    There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.
    2. Yes, the constructor should always have the same name as the class. Constructor looks like method but it is not. It does not have a return type and its name is same as the class name
    */
    public MyMainEmployee(){
        id = 23;
        name = "Prinec Kumar";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    // public void setName(String n){
    //     this.name = n;
    // }
    // public void setId(int i){
    //     this.id = i;
    // }
    public int getId(){
        return id;
    }
}

public class Contruter{
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}

