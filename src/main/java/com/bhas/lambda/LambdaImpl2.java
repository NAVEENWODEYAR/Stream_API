package com.bhas.lambda;

import java.time.LocalDate;

public class LambdaImpl2 
{

	public static void main(String[] args) 
	{
		LambdaEx.m1();
		LambdaEx l1 = year ->year-LocalDate.now().getYear();
		int age = l1.getAge(1996);
		System.out.println(age);
	}

}
