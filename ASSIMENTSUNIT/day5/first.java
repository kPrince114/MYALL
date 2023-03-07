package ass4;
//Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<=20){
            System.out.println("even no " + i);
            i=i+2;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =1;
        while(i<=20){
            System.out.println("odd no " + i);
            i=i+2;
            
        }
    }
}

public class first {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}




