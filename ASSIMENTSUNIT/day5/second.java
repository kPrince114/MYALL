package ass4;

//What is a Race condition, How will you solve the Race condition,explain with an Example.:-- when you call multiple theard in same time then highley change to create race condition; 
// ex:- you have a creadit cart in card balence is 5000 rupee and a day you are go in bank and you brother go in atm and same time  agar app 4000 nikalte ho and same time appka bro 3000 nikalta h.. that time created race conditon  
// solution :-- you are use synchronized keyword 
class Common {

    public synchronized void fun1(String name) {
        System.out.print("Welcome");
        System.out.print(" ");
        try {
            Thread.sleep(1000);
        } 
        catch (Exception ee) {
        }
        System.out.println(name);
    }
}

class ThreadA extends Thread {
    Common c;
    String name;

    public ThreadA(Common c, String name) {
        this.c = c;
        this.name = name;
    }

    @Override
    public  void run() {
        c.fun1(name);
    }
}

class ThreadB extends Thread {
    Common c;
    String name;

    public ThreadB(Common c, String name) {
        this.c = c;
        this.name = name;
    }

    @Override
    public  void run() {
        c.fun1(name);
    }
}

class Main {
    public static void main(String[] args) {
        Common c = new Common();
        // sharing same Common object to two thread
        ThreadA t1 = new ThreadA(c, "Ram");
        ThreadB t2 = new ThreadB(c, "Shyam");
        t1.start();

        t2.start();
    }
}

public class second {

}
