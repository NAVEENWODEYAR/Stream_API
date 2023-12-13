package com.bhas.strmOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	{
		System.out.println(" return non-stream values like primitive or object or collection or return nothing are called terminal operations.");
	}
	public static void main(String[] args) {
		System.out.println("\n Intermediate operations,");
		
		// Terminal Operations, forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
		List<String> list = Arrays.asList("Ammie","Bella","Catherine","Dora","Emmie","Florence","Genny","Helen","Helen");
		
		// toArray(),
		System.out.println("\n ***************");
		Object[] array = list.parallelStream().toArray();
		System.out.println(Arrays.toString(array));
		
		// reduce(),
		System.out.println("\n ***************");
		List<Integer> numList = List.of(1,2,3,4,5,6,7,8,9);
						Integer reduce = numList.parallelStream().reduce(0,Integer::sum);
		System.out.println(reduce);
						String reduce2 = list.stream().reduce("",String::concat);
		System.out.println(reduce2);
		
		// collect(),
		List<String> collect = list.stream().collect(Collectors.toUnmodifiableList());
		System.out.println(collect);
		
	}

}
