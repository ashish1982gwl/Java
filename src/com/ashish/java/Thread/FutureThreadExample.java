package com.ashish.java.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class threadExample implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Ashish";
	}
	
}
public class FutureThreadExample {
	
	public static void main(String a[]) {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		List <Future>objList=new ArrayList<Future>();
	   for(int i=0;i<10;i++) {
			Future<String> obj=executorService.submit(new threadExample());
			objList.add(obj);
	   }
		System.out.println(objList.size());
		executorService.shutdown();
	}
	

}
