package com.ashish.java.general;

public class StarFormation {
	public static void main(String a[]) {
		getStar();
}
	public static  void	getStar(){
		int n=18;
		for (int i = 0; i < n; i++) {
			String str="";
			for (int j = i; j < (n - i); j++) {
				str+="*";
			}
			str=getIntToSpace(i)+str;
			System.out.println(str);
		}
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


/**
 *  
 *********
 ******
  ****
   **
    *

  
 * */
