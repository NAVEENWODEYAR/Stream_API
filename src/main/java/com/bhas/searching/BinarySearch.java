package com.bhas.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	// Using Arrays.binarySearch(),
	static int binarySearch(int[] num)
	{
		System.out.println("Array given,"+Arrays.toString(num));
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the search element:");
		int search = sc.nextInt();
		
		return Arrays.binarySearch(num, search);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Binary Search");
		int[] arr = {1,9,2,8,3,7,5};
		int n = binarySearch(arr);
		
		if(n>0)
			System.out.println("\nElement found at index,"+n);
		else
			System.out.println("\n Element not found");
		
	}

}
