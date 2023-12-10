package com.bhas.strmIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples2 {
	public static void main(String[] args) {
		System.out.println("\n ******** \n");
		
		//1. Finding And Matching Operations,
		boolean anyMatch = Arrays.stream(new String[] {"Bhaskar","Nandi","Gowri","Gani","Lakshmi","MahaLakshmi"}).anyMatch(s->s.startsWith("g"));
		System.out.println("Found the matched string,"+anyMatch);
	}
}
