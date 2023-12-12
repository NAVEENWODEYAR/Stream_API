package com.bhas.strmOperations;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {
	{
		System.out.println("\nAs intermediate operations return another stream as a result, they can be chained together to form a pipeline of operations. "
				+ "Terminal operations can not be chained together.");
	}
	public static void main(String[] args) {
		System.out.println("\n Intermediate operations,");
		List<String> list = Arrays.asList("Ammie","Bella","Catherine","Dora","Emmie","Florence");
		
		list.parallelStream().filter(str->str.length()>=5).forEach(System.out::println);
	}

}
