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
	
	// Java implementation of iterative Binary Search,
	static int binarySearch(int[] num,int target)
	{
		int left = 0;
		int right = num.length-1;
		int mid = (left+right)/2;
		
		while(left<=right)
		{
			if(num[mid] == target)
				return mid;
			else if(num[mid] > target)
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
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
