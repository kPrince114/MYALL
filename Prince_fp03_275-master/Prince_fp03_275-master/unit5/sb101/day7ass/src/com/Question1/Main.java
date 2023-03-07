package com.Question1;

import java.util.concurrent.*;

class MyCallable implements Callable<String> {
	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public String call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + " .. is responsible to find the sum of first " + num + " numbers");
		if(num%2==0) {
			return "number is odd";
		}
		else {
			return "number is Even";
		}
		
	}
}

class Main {
	public static void main(String[] args) throws Exception {
		MyCallable[] jobs = { new MyCallable(27), new MyCallable(20), new MyCallable(19), new MyCallable(2),
				new MyCallable(50), new MyCallable(60), };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable job : jobs) {
			Future<String> f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
