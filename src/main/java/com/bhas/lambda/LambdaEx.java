package com.bhas.lambda;

@FunctionalInterface
public interface LambdaEx {
	
	static void m1() {
		System.out.println("Static method");
	}
	int getAge(int year);
	
	default void m2()
	{
		System.out.println("\n Default method");
	}
	
}
