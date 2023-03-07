package dya7ass;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    int mark;
    String name;
    int roll_no;
    String add;

    public MyCallable(int mark,String name,int roll_no,String add) {
        this.mark=mark;
        this.name=name;
        this.roll_no=roll_no;
        this.add=add;
    }
    @Override
    public Integer call() throws Exception {
        if(mark>20){
            System.out.println(mark);
            System.out.println("you are pass ***************");
        }
        else{
            System.out.println("you are fail ----------------");
        }
        
        return null;
    }
}

class first {
    public static void main(String[] args) throws Exception {
       // MyCallable m=new MyCallable(0)
        MyCallable[] jobs = {
            new MyCallable(12, "prince", 110,"sabal"),
            new MyCallable(15, "prince", 110,"sabal"),
            new MyCallable(16, "prince", 110,"sabal"),
            new MyCallable(17, "prince", 110,"sabal"),
            new MyCallable(19, "prince", 110,"sabal"),
            new MyCallable(22, "prince", 110,"sabal")    
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (MyCallable job : jobs) {
            Future f = service.submit(job);
            //System.out.println(f.get());
        }
        service.shutdown();
    }
}