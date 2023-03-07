package Question5;



class ThreadA extends Thread {

	A a1;

	public ThreadA(A a1) {
		this.a1 = a1;
		
	}

	@Override
	public void run() {
		a1.sayHello("prince kumar");

	}
}

class ThreadB extends Thread {

	A a1;

	public ThreadB(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.sayHello("prince kumar");
		
	}
}
class ThreadC extends Thread {

	A a1;

	public ThreadC(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.sayHello("prince kumar");
		
	}
}

public class p {
	public static void main(String[] args) {

		A a1 = new A();
		

		ThreadA ta = new ThreadA(a1);
		ThreadB tb = new ThreadB(a1);
		ThreadC tc = new ThreadC(a1);

		ta.start();
		tb.start();
		tc.start();
	}

}