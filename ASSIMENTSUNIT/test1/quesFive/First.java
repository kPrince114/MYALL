package quesFive;

// what is Method reference :--- Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression
/*
// What is Strem api:-A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
//1.... Static Method:-
interface Sayable{  
    void say();  
}  
public class First {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
       
        Sayable sayable = First::saySomething;  
       
        sayable.say();  
    }  
}  
*/
// Constructor ;---
/* 
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class First {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}  
*/
/// non-Static
public class First {
    public void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        ((Object) Arrays.asList("a", "b", "c")).forEach(Chapter3::print);
    }
}
