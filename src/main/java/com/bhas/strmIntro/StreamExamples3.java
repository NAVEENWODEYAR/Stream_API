package com.bhas.strmIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples3 {
	public static void main(String[] args) {
		System.out.println("\n ******** \n");
		
		//1. peek(),Performs an additional action on each element of a stream. This method is only to support debugging where you want to see the elements as you pass in a pipeline.
		Arrays.stream(new String[] {"1,",".3","5","7@#","9"})
											.filter((s->s.length()>1))
											.peek(e->System.out.println("Filtered name,"+e))
											.map(String::toUpperCase)
											.peek(s->System.out.println("Mapped string"+s));
	}
}
