package com.bhas.scp;

public class StringCompare 
{

	static void internString()
	{
		String s = "One";
		String s1 = "Two";
		String s2 = "Three";
		String s3 = "Four";
		String s4 = new String("Four");
		String s5 = s4;
		
		//  intern() creates an exact copy of a String object in the heap memory and stores it in the String constant pool.
		System.out.println("\n**str.intern()***");
		System.out.println(s5.intern());
	}
	
	public static void main(String[] args) 
	{
		String st = "String pool is nothing but a storage area in Java heap where string literals stores";
		String st1 = new String("String pool is nothing but a storage area in Java heap where string literals stores");
		
		if(st==st1)
		
			System.out.println("\n== operator for reference comparison (address comparison)");
		else if(st.contentEquals(st1))
			System.out.println("\nequals() method for content comparison.");
		else
			System.out.println("\n*****");
		
		internString();
	}

}
