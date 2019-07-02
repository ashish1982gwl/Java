package com.ashish.java.Thread;

public class IntruppetedExample {
	public static void main(String a[]) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						VolitileExample.counter++;
						System.out.println("---Producer ----");
						Thread.sleep(10000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		try {
			t1.interrupt();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
