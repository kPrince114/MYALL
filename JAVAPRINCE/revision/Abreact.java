
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
class Child5 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
 class child4 extends Parent2{
    // @Override
    public void greet2(){
        System.out.println("bas ase hi bana diya");
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        
    }
}
public class Abreact {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        // Child2 c = new Child2();
        // Child5 c2 = new Child5();
        child4 s=new child4();
        s.greet2();
            
        
        //Child3 c3 = new Child3(); -- error
    }
}

//Abstract:-khayali palau
//