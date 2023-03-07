package com.Question2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
class mycallble  implements Callable<String>{
	Student s;
	mycallble(Student s){
		this.s=s;
	}
	@Override
	public String call() throws Exception {
		//************* you are not specify purely *******************
		if(s.getMarks()<=450) {
			return "Roll "+ s.getRoll()+ " student is Fail";
		}
		else {
			return "Roll "+ s.getRoll() +" Student is pass";
		}
		
	}
	
}

public class main1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		mycallble[] mjoby= {new mycallble(new Student(10, "Varun", "Pune", 450)),new mycallble(new Student (20,"prince","mp",700)),
				new mycallble(new Student (25,"suman kumar","ap",400)),new mycallble(new Student (27,"raj kumar","bihar",500)),
				new mycallble(new Student (22,"ram kumar","ap",400)),new mycallble(new Student (30,"mohan kumar","ap",800))
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(mycallble m:mjoby) {
			Future<String> f = service.submit(m);
			System.out.println(f.get());
		}
		service.shutdown();
	}

	
}
