package Question2;

import java.util.concurrent.*;

class MyCallable implements Callable {
    int roll_no;
    String name;
    int mark;


    public MyCallable(int roll_no, String name, int mark) {
        this.roll_no = roll_no;
        this.name = name;
        this.mark = mark;
    }
    public MyCallable(Student student) {
        this.roll_no=student.roll_no;
    }
    @Override
    public Object call() throws Exception {
        System.out.println("roll "+roll_no +" Student is fial");
        return roll_no;
    }
}

class first {
    public static void main(String[] args) throws Exception {
        // Student st=new Student()
        MyCallable[] jobs = {
                new MyCallable(new Student(10, "prince", 10,"sabalpur")),
                new MyCallable(new Student(11, "prince", 11,"sabalpur")),
                new MyCallable(new Student(12, "prince", 12,"sabalpur")),
                new MyCallable(new Student(13, "prince", 12,"sabalpur")),
                new MyCallable(new Student(13, "prince", 12,"sabalpur"))
        };
        ExecutorService server = Executors.newFixedThreadPool(3);
        for (MyCallable job : jobs) {
            Future fut = server.submit(job);
            //  System.out.println();
        }
        server.shutdown();
    }
}