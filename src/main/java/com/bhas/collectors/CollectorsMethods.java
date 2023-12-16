package com.bhas.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
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
	    
		// 5. Finding minimum value: minBy(),
	    		System.out.println("\n Collectors.minBy()");
	    		Integer min = oddNumbers.parallelStream().min((o1, o2) -> o1-o2 ).get();
	    		Integer min1 = oddNumbers.stream().sorted().findFirst().get();
	    		Integer min2 = oddNumbers.parallelStream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
	    		System.out.println("Minimum value in the collection,"+min+" "+min1+" "+min2);
	    
	    
	    // 6.  Finding maximum value: maxBy()
				System.out.println("\n Collectors.maxBy()");
				Integer max = oddNumbers.parallelStream().max(Comparator.naturalOrder()).get();
				Integer max1 = oddNumbers.stream().sorted().min(Comparator.reverseOrder()).get();
				Integer max2 = oddNumbers.parallelStream().sorted(Comparator.reverseOrder()).findFirst().get();
				Integer max3 = oddNumbers.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::intValue))).get();
				System.out.println("Maximum value in the collection,"+max+""+max1+""+max2+""+max3);
	
	   
		// 7. Partitioning a list: partitioningBy(),
				System.out.println("\n Collectors..partitioningBy()");
				Map<Boolean, List<Integer>> collect = oddNumbers.parallelStream().collect(Collectors.partitioningBy(n -> n/2 ==0));
				System.out.println(collect);
	
		
	   // 8. Creating unmodifiable list: toUnmodifiableList(),UnsupportedOperationException.
				System.out.println("\n Collectors.toUnmodifiableSet");
				Set<Integer> unmodifiableSet =  oddNumbers.parallelStream().sorted().collect(Collectors.toUnmodifiableSet());
				System.out.println(unmodifiableSet);
				
		*/
	   // 10. Joining elements: joining(),Collectors can be used to create a string by joining all the elements of a collection, with or without any delimiter, suffix, and prefix.
				System.out.println("\n Collectors.joining()");
				List<String> namesList = Arrays.asList("Gowri","Nandi","Gani","Lakshmi","MahaLakshmi","Santhanam");
				List<String> namesList1 = Arrays.asList("1","2","3","4","5","6");
				String joinedString0 = namesList.stream().collect(Collectors.joining(" "));
				String joinedString = namesList.parallelStream().collect(Collectors.joining(" ", "[", "]"));
				System.out.println(joinedString+" "+joinedString0);
				String collect = namesList1.parallelStream().collect(Collectors.joining("-", "[", "]"));
				System.out.println(collect);
		
	  
	}
	

}
