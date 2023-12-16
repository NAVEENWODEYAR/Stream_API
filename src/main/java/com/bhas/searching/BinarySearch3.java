package com.bhas.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch3 
{
	// Using recursion,
	static int binarySearch(int[] num,int left, int right, int element)
	{
		if(right >= left)
		{
			int mid = left +(right - left) / 2;
			
			if(num[mid] == element)
			{
				return mid;
			}
			else if(num[mid] > element)
			{
				return binarySearch(num, left, mid-1, element);
			}
			else
				return binarySearch(num, mid+1, right, element);
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Binary Search");
		int[] arr = {1,9,2,8,3,7,5};
		Arrays.sort(arr);
		int n = binarySearch(arr,0,arr.length-1,9);
		
		if(n != -1)
			System.out.println("\nElement found at index,"+n);
		else
			System.out.println("\n Element not found");
		
	}

}
