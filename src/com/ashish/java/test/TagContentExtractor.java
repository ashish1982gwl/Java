package com.ashish.java.test;

public class TagContentExtractor {

	public static void main(String a[]) {
		String str = "<h1>Nayeem loves counseling</h1>\n"
				+ "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\n"
				+ "<Amee>safat codes like a ninja</amee>\n" + "<SA premium>Imtiaz has a secret crush</SA premium>";
		Sepration(str);
	}

	public static String Sepration(String str) {
		String finalString = "";
		while (str.indexOf("<") != -1) {
			String startemp = str.substring(str.indexOf("<") + 1, str.indexOf(">"));
			if (!startemp.equals("")) {
				String endTemp = "</" + startemp + ">";
				startemp = "<" + startemp + ">";
				String tempFinalString = getStringBetweenTag(str, startemp, endTemp);
				System.out.println(tempFinalString);
//				while (tempFinalString.indexOf("<") != -1) {
//					String fstartemp = str.substring(str.indexOf("<") + 1, str.indexOf(">"));
//					String fendTemp = "</" + fstartemp + ">";
//					fstartemp = "<" + fstartemp + ">";
//					String ftempFinalString = getStringBetweenTag(tempFinalString, fstartemp, fendTemp);
//					tempFinalString = nextTag(tempFinalString, startemp, endTemp);
//					System.out.println("             hh          "+ftempFinalString);
//				}
				str = nextTag(str, startemp, endTemp);
			}
		}
		return finalString;

	}

	public static String getStringBetweenTag(String str, String startemp, String endTemp) {
		String finalString = "None";
		if (str.indexOf(endTemp) != -1) {
			finalString = str.substring(str.indexOf(startemp) + startemp.length(), str.indexOf(endTemp));
		}
		return finalString;
	}

	public static String nextTag(String str, String startemp, String endTemp) {
		str = str.substring(str.indexOf(startemp) + startemp.length());
		if (str.indexOf(endTemp) != -1) {
			str = str.substring(str.indexOf(endTemp) + startemp.length() + 1);
		} else {
			str = str.substring(str.indexOf(">") + 1);
		}
		return str;
	}

}
