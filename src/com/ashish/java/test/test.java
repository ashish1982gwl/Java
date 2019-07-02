package com.ashish.java.test;

import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Complete the 'MaxOccuringChar' function below.
 *
 * The function is expected to return a CHARACTER.
 * The function accepts STRING str as parameter.
 */

public class test {
	public static void main(String ss[]) {
		String str = "Sanju  how are you";
		List<Integer> objList = new ArrayList<Integer>();

		int strLength = str.length();
		int intCounter = 0;
		int spaceCounter = 0;
		boolean flag = false;
		if (str.charAt(0) != ' ') {
			objList.add(0);
		}

		while (intCounter < strLength) {
			Character ch = str.charAt(intCounter);
			if (ch == ' ') {
				flag = true;
				spaceCounter++;
			} else {
				flag = false;
				if (!flag && spaceCounter > 0) {
					objList.add(spaceCounter);
				}
				spaceCounter = 0;
			}
			intCounter++;
		}
		System.out.println(objList);

		intCounter = 0;
		String finalString = "";
		String strArray[] = str.split(" ");
		try {
			for (int i = strArray.length - 1; i >= 0; i--) {
				String tempString = strArray[i];
				tempString = tempString.trim();
				if(!tempString.equals("")) {
					int j=objList.get(intCounter);
					finalString += getIntToSpace(j) + tempString;
					intCounter++;
				}
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(finalString);
	}

	public static String getIntToSpace(int counter) {
		String str = "";
		try {
			while (counter > 0) {
				str = str + " ";
				counter--;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return str;
	}
}