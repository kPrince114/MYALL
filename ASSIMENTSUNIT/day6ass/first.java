package day6ass;

// import day6.first;

class first1 extends Thread {
    int pro=1;
    public void run() {
        synchronized (this) {
            System.out.println("first function start in calculate all function");
            for (int i = 1; i <=10; i++) {
                pro *= i;
            }
            System.out.println("calucation part  end now()... ");
            this.notify();
        }
       

    }
    
}
 
class firrt{
    public static void main(String[] args) throws InterruptedException {
        first1 f1=new first1();
        f1.start();
        synchronized(f1){
            System.out.println("it is main fun");
            f1.wait();
            System.out.println("wait call back fun");
        }
        System.out.println(f1.pro);

    }

}