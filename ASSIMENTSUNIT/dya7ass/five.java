package dya7ass;

// - What is the deadlock, write a program to demonstrate the Deadlock situation.
// deadlock:--  If two threads are waiting for each other forever(for infinite time). and then  A lock without key is nothing but deadlock. 
// sloution :-use The synchronized keyword is the only reason for deadlock.
class A {
    public synchronized void funA(B b1) {
        System.out.println("funA of A starts");
        b1.fun2();
        System.out.println("funA of A ends");
    }

    public synchronized void fun1() {
        System.out.println("inside fun1 of A");
    }
}

class B {
    public synchronized void funB(A a1) {
        System.out.println("funB of B starts");
        a1.fun1();
        System.out.println("funB of B ends");
    }

    public synchronized void fun2() {
        System.out.println("inside fun2 of B");
    }
}

class ThreadA extends Thread {
    A a1;
    B b1;

    public ThreadA(A a1, B b1) {
        this.b1 = b1;
        this.a1 = a1;
    }

    @Override
    public void run() {
        a1.funA(b1);
    }
}

class ThreadB extends Thread {
    A a1;
    B b1;

    public ThreadB(A a1, B b1) {
        this.b1 = b1;
        this.a1 = a1;
    }

    @Override
    public void run() {
        b1.funB(a1);
    }
}

class five {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        ThreadA t1 = new ThreadA(a1, b1);
        ThreadB t2 = new ThreadB(a1, b1);
        t1.start();
        t2.start();
    }
}