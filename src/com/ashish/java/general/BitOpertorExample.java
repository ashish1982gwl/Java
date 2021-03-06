package com.ashish.java.general;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BitOpertorExample {
	public static void main(String aa[]) {
		
		class inner{
			final int i=2;
			int j=3;
			inner(){
				System.out.println(i+j);

			}
		}

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
