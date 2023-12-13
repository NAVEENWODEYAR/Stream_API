package com.bhas.array;

import java.util.Arrays;

public class SecondLargestElement 
{
	static void secLargestInArray(int[] nums)
	{
		Arrays.sort(nums);
		System.out.println(nums[nums.length-2]);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Homogeneous collectin of elements stored at contiguous memory locations");
		int[] nums = {5,7,3,1,8,0};
		secLargestInArray(nums);
	}

}
