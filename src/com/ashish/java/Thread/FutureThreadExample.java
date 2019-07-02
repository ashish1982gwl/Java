package com.ashish.java.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadExample implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Ashish";
	}
	
}
public class FutureThreadExample {
	
	public static void main(String a[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		List <Future<String>>objList=new ArrayList<Future<String>>();
	   for(int i=0;i<10;i++) {
			Future<String> obj=executorService.submit(new ThreadExample());
			objList.add(obj);
	   }
		for( Future<String> fut:objList) {
			System.out.println(fut.get());
		}
		executorService.shutdown();
	}
	

}
