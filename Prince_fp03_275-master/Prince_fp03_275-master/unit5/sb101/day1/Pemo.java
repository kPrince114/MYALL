package day1;

public class Pemo {
    /* inside class in method;(**)
    public void fun1(A i){
        System.out.println("inside the fun1 ");
        i.funA();
        // return i;
    } 
    */
    // if your return type interface then you have two face (1).null Value (2).implememt obj class (****);
    public intr fun1(){
        System.out.println("inside the fun1 ");
        // intrimpl obj=new intrimpl();
        // return obj;

        // intr i1=(r,n,m)->new Student(r, n, m);
        // return i1;
        return (r,n,m)->new Student(r, n, m);
    } 
    
    public static void main(String[] args) {
        /* 
        intr i= new intrimpl();
        // System.out.println();
        Student s1=i.getStudent(10, "pk", 110);
        System.out.println(s1.toString());
        System.out.println(s1.getmark());
        // Student s1=new Student(10, "pk", 110);
        intr i2=(r,n,m)->{
            Student studen=new Student(r, n, m);
            return studen;
        };
        Student s2=i2.getStudent(10, "rajkumar", 100);
        System.out.println(s2.getroll_no());
        */
        /*(**)
        Pemo p=new Pemo();
        A obj = new A();
        p.fun1(obj);
        */

        /* 
        // type casting to upper class not direct call(****)
         Pemo p=new Pemo();
        Object upper=p.fun1();
        intr tc=(intr) upper;
        Student s=tc.getStudent(12, "pr", 12);
        System.out.println(s);
         */
        



    } 
    
        
}
// using stream we are perform the operations without touching our original collection object
// suppose if we use removeIf() method to filter then it will remove elements from original objects
// but if you don't want this behaviour then using filter method you can do easily without changing original object