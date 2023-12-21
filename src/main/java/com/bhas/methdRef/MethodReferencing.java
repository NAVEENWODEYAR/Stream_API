package com.bhas.methdRef;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferencing {

	public static void main(String[] args) {
		
		System.out.println("\n shortened versions of lambda expressions calling a specific method");

		// a) Method reference to static method,
		String string = Arrays.asList("One","Two","Three","Four","Five")
								.stream()
								.max(Comparator.comparing(String::length))
								.get();
		System.out.println("\n String with the max length,"+string+" of length "+string.length());

	}

}
