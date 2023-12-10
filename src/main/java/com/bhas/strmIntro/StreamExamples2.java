package com.bhas.strmIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples2 {
	public static void main(String[] args) {
		System.out.println("\n ******** \n");
		
		//1. Finding And Matching Operations,anyMatch() : Any one element matches
		boolean anyMatch = Arrays.stream(new String[] {"Bhaskar","Nandi","Gowri","Gani","Lakshmi","MahaLakshmi"}).anyMatch(s->s.startsWith("G"));
		System.out.println("\nFound the matched string,"+anyMatch);
		
		//2. allMatch() : All elements matches,
		boolean allMatch = Arrays.stream(new int[] {3,5,7,9}).allMatch(n->n/2!=0);
		System.out.println("\nGiven list is odd,"+allMatch);
		
		boolean noneMatch = Arrays.stream(new int[] {1,2,3,4,5,6,7,8}).noneMatch(n->n*n >1);
		System.out.println(noneMatch);
	}
}
