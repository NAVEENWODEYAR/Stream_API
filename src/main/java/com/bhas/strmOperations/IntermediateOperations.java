package com.bhas.strmOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
	{
		System.out.println("\nAs intermediate operations return another stream as a result, they can be chained together to form a pipeline of operations. "
				+ "Terminal operations can not be chained together.");
	}
	public static void main(String[] args) {
		System.out.println("\n Intermediate operations,");
		
		// Intermediate operations, filter(),skip(),limit(),distinct(),sorted(),flatmap(),.
		List<String> list = Arrays.asList("Ammie","Bella","Catherine","Dora","Emmie","Florence");
		
		// filter,
		System.out.println("*************");
		list.parallelStream().filter(str->str.length()>=5).forEach(System.out::println);
		
		// map(),
		System.out.println("*************");
		list.parallelStream().map(str->str.toUpperCase()).forEachOrdered(System.out::println);
		
		// flatmap(),
		System.out.println("*************");
		list.stream().flatMap(str->Stream.of(str.charAt(1))).forEach(System.out::println);
		
		// skip(),
		System.out.println("*************");
		list.parallelStream().skip(4).forEachOrdered(System.out::println);
		
		// limit(),
		System.out.println("*************");
		list.parallelStream().limit(4).forEach(System.out::println);
	}

}
