package com.ashish.java.general;

class Parent {
	public void show() {
		System.out.println("Parent Called ");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("child Called ");
	}
}

public class Inheritance {
	public static void main(String aa[]) {
		Parent Parent = new Parent();
		Parent.show();
		
		Child Child = new Child();
		Child.show();
		
		Parent Parent1=new Child();
	    Parent1.show();
	}

}
