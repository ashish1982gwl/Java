package com.ashish.java.test;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
public class FourWheeler {
	public static void main(String a[]) {
		List<Integer> objList = new ArrayList<Integer>();
		//1 1 1 1 0 0 0 0

//		objList.add(1);
//		objList.add(1);
//		objList.add(1);
//		objList.add(1);
//		objList.add(0);
//		objList.add(0);
//		objList.add(0);
//		objList.add(0);

		//System.out.println(objList);
		
		
		

		//objList = countSum(objList);
	    
		
		objList.add(1);
		objList.add(3);
		objList.add(5);
		objList.add(16);
		objList.add(21);

		System.out.println(countSum(objList));
	}

	
	 public static List<Integer> chooseFleets(List<Integer> wheels){
			List<Integer> objList = new ArrayList<Integer>();

		 for(int i=0;i<wheels.size();i++) {
			int b=wheels.get(i);
			//four(b);
			objList.add(four(b));

		 }
		 return objList;
		 
	 }
	 public static int four(int b) {
//			System.out.println(" b------------ "+b);

		 if(b>=4) {
			 int remainder=b%4;
			 int four=b/4;
//				System.out.println("remainder  "+remainder);
//				System.out.println("four  "+four);
				if(remainder==0 ) {
					if(b>4) {
						return four-1+2;

					}
					else {
						return four*2;
					}
				}
				else {
					if(remainder==2) {
						return four+1;
					}else {
						return 0;
					}
				}
		 }
		 if(b==2) {
			 return 1;
		 }
         return 0;			

	 }
	
	
	
	public static long countSum(List<Integer> numbers) {
		long a = 0l;
		for (int i = 0; i < numbers.size(); i++) {
			if (i <= 50000) {
				int b = numbers.get(i);
				for (int j = 1; j <= b; j++) {
					if (b % j == 0 && j % 2 != 0) {
						a += j;
					}
				}
			}

		}

		return a;
	}
}
