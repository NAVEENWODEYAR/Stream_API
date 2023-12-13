package com.bhas.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 
{
	// Java implementation of iterative Binary Search,

	
	public static void main(String[] args) 
	{
		System.out.println("\n Binary Search");
		int[] arr = {1,9,2,8,3,7,5};
		int index = binarySearch(arr, 1);
		
		if( index > 0)
			System.out.println("Element found at the index,"+index);
		else
			System.out.println("Element not found");
	
	}

}
