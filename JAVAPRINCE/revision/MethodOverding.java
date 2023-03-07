
/*// jab aap parent class ka nethod ka nam child class ke naam same rakhto ho to use method over reide kahee h.. (If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.)
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverding  {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
*/
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// Creating child classes.
class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}

// Test class to create objects and call the methods
class MethodOverding {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
/*Rules for Java Method Overriding
1.The method must have the same name as in the parent class
2.The method must have the same parameter as in the parent class.
3.There must be an IS-A relationship (inheritance). */