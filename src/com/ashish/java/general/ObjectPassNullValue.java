package com.ashish.java.general;

class Test {
	public void sendData(Object s) {
		System.out.println("call Object");

		System.out.println(s.toString());
	}

//	public void sendData(String s) {
//		System.out.println("call String");
//		System.out.println(s);
//	}

	public void sendData(Integer s) {
		System.out.println("call Integer");
		System.out.println(s);
	}
}

public class ObjectPassNullValue {
	public static void main(String a[]) {
		Test test = new Test();
		test.sendData(null);
	}

}
