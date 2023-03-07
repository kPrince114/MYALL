package day1;
// function interface:-

/* 
interface sayable{  
    void say(String msg);  
}  
public class first implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        first fie = new first();  
        fie.say("Hello there");  
    }  
}  
*/
/* 

// interface;-An interface in Java is a blueprint of a class. It has static constants and abstract methods.
interface sayable{  
    void say(String msg); 
    void print(int n) ;
}  
public class first implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    @Override
    public void print(int n) {
       System.out.println("i am a number "+n);
        
    }
    public static void main(String[] args) {  
        first fie = new first();  
        fie.print(5);
        fie.say("Hello there");  
    }
      
} 
*/
//Total Abstraction
interface A
{
    public abstract void execute1();
}
interface B
{
    public abstract void execute2();
}
class C implements A,B
{
    public void execute1()
    {
        System.out.println("Haii.. I am from execute1");
    }
    public void execute2()
    {
        System.out.println("Haii.. I am from execute2");
    }
}
public class first
{
	public static void main(String[] args) 
	{
		C obj = new C(); 
		obj.execute1(); 
		obj.execute2(); 
	}
}
