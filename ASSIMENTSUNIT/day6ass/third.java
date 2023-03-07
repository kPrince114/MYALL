package day6ass;
class basic{
    public static synchronized void loop(){
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("it is my call "+ i );
        }
        
    }

}
class th1 extends Thread{
    basic b;
    public th1(basic b){
        this.b=b;
    }
    public void run(){
        b.loop();
    }
}
public class third {
    public static void main(String[] args) {
        /* 
         // class leval lock:- when i an use two theard in one method that time data inconsisity proble then i am use  synchronized keyword in where defiend in your method;
        basic b=new basic();
        th1 th1=new th1(b);
        th1 th2=new th1(b);
        th1.start();
        th2.start();
        */
        // object leval lock:-- when multiple object call or  multiple theard in single method that time use sattic synchronized it is solve
        basic b2=new basic();
        basic b1=new basic();
        basic b3=new basic();
        th1 th=new th1(b1);
        th1 th2=new th1(b2);
        th1 th3=new th1(b3);
        th.start();
        th2.start();
        th3.start();
    }
    
}
