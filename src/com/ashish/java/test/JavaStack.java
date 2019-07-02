package com.ashish.java.test;

import java.util.ArrayList;
import java.util.List;

public class JavaStack {
	public static void main(String aa[]) {
		List<Integer> objList = new ArrayList<Integer>();
		String str = "[({})(())]";
		int len = str.length();
		for (int i = 0; i < (len); i++) {
			int inta = str.charAt(i);
			objList.add(inta);
		}
		System.out.println(objList);
		if (checkStackIsBalanceFromEnd(str)) {
			System.out.println(true);
		} else if (checkStackIsBalanceFromCharcterWise(str)) {
			System.out.println(true);
		} else {
				int a = objList.get(0);
				int b = objList.get((len - 1));
				if(check(a,b)){
					objList.remove(objList.size() - 1);
					objList.remove(0);
					System.out.println(objList);

				}else {
					System.out.println(false);

				}
			}
       
		
	}

	public static boolean checkStackIsBalanceFromEnd(String str) {
		boolean flag = false;
		int len = str.length();
		if (len % 2 != 0) {
			return false;
		}
		for (int i = 0; i < (len / 2); i++) {
			int a = str.charAt(i);
			int b = str.charAt((len - 1) - i);
			flag=check(a,b);
			if(!flag) {
				return false;
			}
		}
		return flag;
	}

	public static boolean checkStackIsBalanceFromCharcterWise(String str) {
		boolean flag = false;
		int len = str.length();
		if (len % 2 != 0) {
			return false;
		}
		for (int i = 1; i < (len); i = i + 2) {
			int a = str.charAt(i - 1);
			int b = str.charAt(i);
			flag=check(a,b);
			if(!flag) {
				return false;
			}
		}
		return flag;
	}
	public static boolean check(int a,int b) {
		if ((b - 1) == a || (b - 2) == a) {
			return true;
		} else {
			return false;
		}
	}
}
