package com.ashish.java.Thread;

public class VolitileExample {
	volatile static	 int  counter =0;
	public static void main(String a[]) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						VolitileExample.counter++;
						System.out.println("---Producer ----");
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						System.out.println("---Consumer----"+VolitileExample.counter);
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.setName("Producer");
		t2.setName("Consumer");
		t1.start();
		t2.start();
		try {
			// t1.join();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

	}

	

}
