package com.Reverse.javapj;

public class FunctionReverse {

	public static void displayReverse(String ex) {
		char[] stc = ex.toCharArray();

		String back = "";
		for (int i = stc.length - 1; i > -1; i--) {
			back += stc[i];
		}
		System.out.println(back);
	}
}
