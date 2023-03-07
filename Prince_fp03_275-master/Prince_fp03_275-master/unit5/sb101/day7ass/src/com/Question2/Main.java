package com.Question2;



import java.util.concurrent.*;

class MyCallable implements Callable<String> {
	Student student;

	public MyCallable(Student student) {
		this.student=student;
	}

	@Override
	public String call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() +" result your check weighter you are pass or fail....");
		if(student.getMarks()>=500) {
			return "pass : "+student.getName();
		}
		else {
			return "fail : "+student.getName();
		}
		
		
	}
}

class Main {
	public static void main(String[] args) throws Exception {
		MyCallable[] jobs = { new MyCallable(new Student(27,"prince",200)), new MyCallable(new Student(27,"prince",400)),
				new MyCallable(new Student(27,"prince",500)), new MyCallable(new Student(27,"prince",470)),
				new MyCallable(new Student(27,"prince",340)), new MyCallable(new Student(27,"prince",610)), };
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (MyCallable job : jobs) {
			Future<String> f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
