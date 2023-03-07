package day6ass;
// What is the difference between the synchronized block and the synchronized method? Write down the different syntaxes of the synchronized block with examples.

// synchronized method:-- Synchronized method is used to lock an object for any shared resource. When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
class firs extends Thread {
    int pro=5;
    public synchronized void run() {
        System.out.println("first function start in calculate all function");
        for (int i = 1; i <=10; i++) {
            System.out.println(" five "+ i+ " ja "+pro*i);
        }
        System.out.println("calucation part  end now()... ");
    }
    
}
 
class four1{
    public static void main(String[] args) throws InterruptedException {
        firs f1=new firs();
        f1.start();
        //System.out.println(f1.pro);

    }

}