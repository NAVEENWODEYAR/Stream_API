package com.bhas.scp;

public class StringCompare 
{

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
	}

}
