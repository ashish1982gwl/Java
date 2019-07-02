package com.ashish.java.test;

import java.util.ArrayList;
import java.util.List;

public class BitArrangement {
	public static void main(String a[]) {

		List<Integer> objList = new ArrayList<Integer>();
		objList.add(1);
		objList.add(1);
		objList.add(1);
		objList.add(1);
		objList.add(0);
		objList.add(0);
		objList.add(0);
		objList.add(0);

		int count = minMoves(objList);
		System.out.println(count);
	}
6
	public static int minMoves(List<Integer> objList) {
		int zeroSwapCount = 0;
		int oneSwapCount = 0;
		List<Integer> objList1 = new ArrayList<Integer>();
		objList1.addAll(objList);

		for (int listCounter = 0; listCounter < objList.size() - 1; listCounter++) {
			if (listCounter >1 && objList.get(listCounter-1) == 1 && objList.get(listCounter) == 0) {
				swapNumber(listCounter, objList, 0, 1);
				oneSwapCount++;
			}
		}
		for (int listCounter = 0; listCounter < objList1.size() - 1; listCounter++) {
			if (listCounter >1 &&  objList.get(listCounter-1) == 0 && objList1.get(listCounter) == 1 ) {
				swapNumber(listCounter, objList1, 1, 0);
				zeroSwapCount++;
			}
		}
	System.out.println(zeroSwapCount);
	System.out.println(oneSwapCount);

		if (zeroSwapCount > oneSwapCount) {
			return oneSwapCount;
		} else {
			return zeroSwapCount;
		}
	}

	public static List<Integer> swapNumber(int count, List<Integer> objList, int value, int rplaceValue) {
		int num = count;
		while (count < objList.size()) {
			if (objList.get(count) == rplaceValue) {
				objList.set(num, rplaceValue);
				objList.set(count, value);
				return objList;
			}
			count++;
		}
		return objList;
	}
	
	
}
