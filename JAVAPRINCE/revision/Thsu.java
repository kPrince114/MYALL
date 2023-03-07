
/*
public class Thsu {

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
class cwh{
    int x;

//    getter of x
    public  int getX(){
        return  x;
    }

    // Constructor with a parameter
    // this:-this keyword eliminates the confusion between the parameters and the class attributes with   the same name. Take a look at the example given below :

    cwh(int x) {
       this.x = x;
    }
}
*/
/* 
//(1). super is used to refer immediate parent class instance variable.
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

public class Thsu {
   public static void main(String[] args) {
    Dog d=new Dog();  
    d.printColor();
   }
    
    

}
*/
/* 
//(2) super can be used to invoke parent class method
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class Thsu {
    public static void main(String[] args) {
        Dog d=new Dog();  
        d.work();  
    }
}
*/
//(3) super is used to invoke parent class constructor.
class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("dog is created");
    }
}
public class Thsu {
    public static void main(String[] args) {
        // Dog d=new Dog();  
    }
}
