package com.bhas.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
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
				
		
		// 2. Creating set: toSet(), accumulates elements into a set(unique values)
				System.out.println("\n Collectors.toSet()");
				Set<Integer> uniqueNumbers = oddNumbers.parallelStream().collect(Collectors.toSet());
				System.out.println("List provided,"+oddNumbers);
				System.out.println("Set obtained,"+uniqueNumbers);
	   
		// 3. Creating specific collection: toCollection(),
				System.out.println("\n Collectors.toCollection()");
				LinkedList<Integer> newList = oddNumbers.parallelStream().filter(n -> n>=5).collect(Collectors.toCollection(LinkedList::new));
				System.out.println("Collection obtained from the list,"+newList+""+newList.getClass());
		
	    // 4. Counting elements: Counting(),
				System.out.println("\n Collectors.count()");
				System.out.println(" Numbers of entries in the collection,"+oddNumbers.stream().count());
	    */
		// 5. Finding minimum value: minBy(),
	    		System.out.println("\n Collectors.minBy()");
	    		Integer min = oddNumbers.parallelStream().min((o1, o2) -> o1-o2 ).get();
	    		Integer min1 = oddNumbers.stream().sorted().findFirst().get();
	    		Integer min2 = oddNumbers.parallelStream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
	    		System.out.println("Minimum value in the collection,"+min+" "+min1+" "+min2);
	}
	

}
