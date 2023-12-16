package com.bhas.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 
{
	static void binarySearch(int arr[], int left, int right, int element)
	{
		int mid = left+right / 2;
		
		while(left <= right)
		{
			if(arr[mid] < element)
				left = mid +1;
			
			else if(arr[mid] == element)
			{
				System.out.println("Element found at the index,"+mid);
				break;
			}
			else
				right = mid - 1;
			
			mid = (left+right) / 2;
		}
		if(left > right)
			System.out.println("Element not found,");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Binary Search");
		int[] arr = {1,9,2,8,3,7,5};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("\n Enter the element to search,");
		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();
		binarySearch(arr, 0, arr.length-1, ele);
	}
}
