package day6ass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class pool1 implements Runnable{
    String name;
    pool1(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("my work is start now " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("my work is end  now " + name);
        
    }
    
}
public class six {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i=1;i<7;i++) {
            if(i%2==0){
                Runnable r=new pool1("it is even number "+i);
                service.execute(r);
            }
            else{
                Runnable r=new pool1("it is odd number "+i);
                service.execute(r);
            }
            
            
        }
         service.shutdown();// to shutdown the executorService.
            
       
    }
}

