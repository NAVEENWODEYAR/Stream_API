package com.bhas.strmIntro;

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
		
		// 1. creating an empty stream,
			Stream<?> strm = Stream.empty();
			System.out.println(strm);
			System.out.println(strm.count());
	}
}
