package com.ashish.general;

public class BitOpertorExample {
	public static void main(String aa[]) {
		two();
		three();
	}

	public static void two() {
		int x = -4;
        System.out.println("Binary is " + Integer.toBinaryString(x)); 

		System.out.println(x >> 1);
		int y = 4;   //110
		System.out.println(y >> 1);
	}

	public static void three() {
		int x = -1;

		System.out.println(x >>> 29); // The value of 'x>>>29' is 00...0111
		System.out.println(x >>> 30); // The value of 'x>>>30' is 00...0011
		System.out.println(x >>> 31); // The value of 'x>>>31' is 00...0001
	}

}
