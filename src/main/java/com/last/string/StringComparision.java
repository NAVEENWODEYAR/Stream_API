package com.last.string;

public class StringComparision {

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("\nString Comparision,");
		
		String st = "Year";
		String s1 = new String("Year");
		System.out.println(st.equals(s1));
  System.out.println("OverRided equals()");
	}

}
 