package com.ashish.java.Thread;

public class JoinExample {
	public static void main(String a[]) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						System.out.println("---Consumer----");
						Thread.sleep(1000);
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
						System.out.println("---Producer----");
						Thread.sleep(1000);
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
			t1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}

	}
}
