package seavnQues;

class ThreadA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            String tname = Thread.currentThread().getName();
            int numset=Thread.currentThread().getPriority();
            System.out.println(tname + " is running ");
            System.out.println(numset + " is running it is peroity ");
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            String tname = Thread.currentThread().getName();
            int numset=Thread.currentThread().getPriority();
            System.out.println(tname + " is running ");
            System.out.println(numset + " is running it is peroity ");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        Thread t1 = new Thread(ta);
        Thread t2 = new Thread(tb);
        t1.setName("dhonni");
        t2.setName("kohli");
        t1.setPriority(8);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
