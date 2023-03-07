/* 
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).
*/
/* siple inheritence
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inhetence {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
*/
// contructure inherence
// if you are use super then you pass arrgument in base class if you want (jiska vi base pass karana ho usi ka parmeter pass kare ihi super keyword ka kam h..)
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
    Base1(int s,int d){
        System.out.println("I am an overloaded constructor with value of x as: "+s+d );
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int s,int d, int y){
        super(s,d);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " +s+d);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        //super();
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int s, int d,int y,int z){
        super(s, d, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class inhetence {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        // ChildOfDerived cd = new ChildOfDerived(12, 13, 15,34);
        // ChildOfDerived sd1=new ChildOfDerived();

    }
}
/*
// letchere 53;
// Exercise & Practice Questions on Inheritance
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public inhetence {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }
}

 */