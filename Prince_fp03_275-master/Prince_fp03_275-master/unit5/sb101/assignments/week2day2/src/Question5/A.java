package Question5;

public  class A {

	public synchronized void  sayHello(String name) {

		System.out.println("Welcome :");

		try {

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();

		}

		System.out.println(name);

	}

}
