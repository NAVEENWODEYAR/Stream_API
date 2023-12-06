package com.bhas.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsMethods2 
{
	
	public static void main(String[] args) 
	{
		List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9,1,3,5,7);
		System.out.println("*********");
		
		/* 
		// 1. Averaging long: averagingLong(),Finds the average value of a collection of long values,  It will return a Double value, not a long value.
			System.out.println("\n Collectors.averagingLong(n->n*n) ");
			byte avgValue = oddNumbers.parallelStream().collect(Collectors.averagingLong(n->n*n)).byteValue();
			System.out.println("Average value in the collection,"+avgValue);
	
		// 2. Averaging Double: averagingDouble(),Finds the average value of a collection of double values.
			System.out.println("\n Collectors.averagingLong(n->n*n) ");
			int avgInt = oddNumbers.stream().collect(Collectors.averagingInt(n->n+1)).intValue();
			System.out.println("Average value in the form of int,"+avgInt);
	
		*/
	    // 3. Summing Integers: summingInt(),
			System.out.println("\n Collectors.averagingLong(n->n*n) ");
			int sum = oddNumbers.stream().collect(Collectors.summingInt(n->n)).intValue();
			System.out.println("Sum of the collection,"+sum);
	}
}
