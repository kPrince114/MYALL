package day6ass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// What is a ThreadPool, how to create a thread pool of 4 threads, and write down the difference between the Callable and Runnable interface. 
//ans:- Thread pool is a pool of already created threads ready to do our tasks.and theard pool in in a concept that whenver you work is not completed till that the time your theard created and it do work;
// Difference Between Runnable and Callable:
// 1. If a thread won't returns anything. and If a Thread returns anything
//2. only one method public void run() and  only one method public Object call() throws Exception
//3. return type void  and return type object
//4. from java 1.0 version and from java 1.5 version
class pool implements Runnable{
    String name;
    pool(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("my work is start now " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("my work is end  now " + Thread.currentThread().getName());
        
    }
    
}
public class five {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i=1;i<9;i++) {
            Runnable r=new pool("my theard pk "+i);
            service.execute(r);
            
        }
         service.shutdown();// to shutdown the executorService.
            
       
    }
}
