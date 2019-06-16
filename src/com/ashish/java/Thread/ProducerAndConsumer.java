package com.ashish.java.Thread;

/**
 * wait and notify alwasy use in resources not in Produce and consumer Thread,
 * Otherwise Thread monitor Exception will come
 * 
 * @author ashish
 *
 */
public class ProducerAndConsumer {
	public static void main(String a[]) {
		Resource resource = new Resource();
		Producer producer = new Producer(resource);
		Consumer consumer = new Consumer(resource);
		producer.start();
		consumer.start();

	}
}

class Resource {
	private int item = 0;
	boolean flag = true;

	public void getItem() {
		while (true) {
			synchronized (this) {
				if (!flag) {
					try {
						System.out.println("Consumer consume item :" + item);
						flag = true;
						Thread.sleep(10);
						notify();
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	public void setItem() {
		while (true) {
			synchronized (this) {

				if (flag) {
					try {
						item++;
						System.out.println("Producer creating item :" + item);
						flag = false;
						Thread.sleep(10);
						notify();
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}

}

class Producer extends Thread {
	Resource resource = null;

	Producer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.setItem();
	}
}

class Consumer extends Thread {
	Resource resource = null;

	Consumer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.getItem();
	}
}
