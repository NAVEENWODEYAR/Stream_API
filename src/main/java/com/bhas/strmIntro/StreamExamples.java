package com.bhas.strmIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples 
{
	static
	{
		System.out.println("\n Streams can be defined as a sequences of elements from a source which support data processing operations. "
				+ "\n You can treat streams as operations on data.");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n ******** \n");
		
		// 1. empty() : Creates an empty stream,
			Stream<?> strm = Stream.empty();
			System.out.println(strm);
			System.out.println(strm.count());
			
	   // 2. of(T t) : Creates a stream of single element of type T,
			Stream<String> strm1 = Stream.of(new String());
			System.out.println(strm1+"="+strm1.count());
			
	   // 3. of(T… values) : Creates a stream from values,
			Stream<Integer> strm2 = Stream.of(1,3,5,8);
			System.out.println(strm2+"="+strm2.count());
			
	  // 4. Creating streams from collections,
			List<String> arrList = new ArrayList<>(1);
						arrList.add(0, "Five");
						arrList.add(1, "Eight");
						arrList.add(2, "Three");
						arrList.add(3, "One");
						
			Stream<String> strm3 = arrList.stream();
							strm3.forEach(System.out::println);
							
	 // 5. Selection Operations,
	 // a. filter() : Selecting with a predicate,
							strm3.filter(n -> n.length()>= 2).forEach(System.out::println);
	}
}
