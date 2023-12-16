package com.bhas.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class SecondLargestElement 
{
	static void secLargestInArray(Integer[] nums)
	{
		Arrays.sort(nums);
		System.out.println(nums[nums.length-2]);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Homogeneous collection of elements stored at contiguous memory locations");
		Integer[] nums = {5,7,3,1,8,0};
		secLargestInArray(nums);
	}
	
	static void secLargestNum(Integer[] nums)
	{
		System.out.println("\n**********");
		List<Integer> list = new ArrayList(Arrays.asList(nums));
//		list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new NoSuchElementException("No value"));
		
		Integer secL = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest number in the array,"+secL);
	}

}
