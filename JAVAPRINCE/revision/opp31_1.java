
/* 
 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

 public class opp31_1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
*/
// question in oops 
/* 
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class opp31_1{
    public static void main(String[] args) {
        Employee em1=new Employee();
        em1.name="prince";
        em1.salary=23;
        em1.setName("rajkuamr");
        System.out.println(em1.getSalary());
        System.out.println(em1.name);
    }
}
*/
/* 
Access Modifier	  within class	 within package	   outside package by subclass only	  outside package
public	            Y	            Y	                        Y	                    Y
protected	        Y	            Y	                        Y	                    N
Default	            Y	            Y	                        N	                    N
private	            Y	            N	                        N	                    N
*/

//******************* why use geter and seter;- if you use privite acces modifire then that time use geeter and seter oyherwise not impliment your code *******************

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class opp31_1 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
