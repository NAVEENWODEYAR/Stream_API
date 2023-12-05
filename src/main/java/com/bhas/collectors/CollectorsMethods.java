package com.bhas.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMethods 
{
	static
	{
		System.out.println("\n Collectors is a final class that extends the Object class. "
				+ "It provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc. "
				+ "Java Collectors class provides various methods to deal with elements.\r\n");
	}
	
	// instance block
	{
		System.out.println("Collectors class is a final utility class in the java.util.stream package. "
				+ "It provides a set of static factory methods for creating collectors used in various operations involving streams. ");
	}
	
	public static void main(String[] args) 
	{
		List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9,1,3,5,7);
		System.out.println("*********");
		/*
		// 1. Creating list: toList(),accumulates elements into a list
				System.out.println("\n Collectors.toList()");
				List<Integer> powerOfNumber = oddNumbers.stream().map(n -> n*n).collect(Collectors.toList());
				System.out.println("Original list,"+oddNumbers);
				System.out.println("Modified list,"+powerOfNumber);
				
		*/
		// 2. Creating set: toSet(), accumulates elements into a set(unique values)
				System.out.println("\n Collectors.toset()");
				Set<Integer> uniqueNumbers = oddNumbers.parallelStream().collect(Collectors.toSet());
				System.out.println("List priovided,"+oddNumbers);
				System.out.println("Set obtained,"+uniqueNumbers);
				
	}
	

}
