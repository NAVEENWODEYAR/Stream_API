package com.bhas.lambda;

import java.time.LocalDate;

public class LambdaImpl implements LambdaEx
{

	@Override
	public int getAge(int year) 
	{
		return LocalDate.now().getYear() - year;
	}
	public static void main(String[] args) 
	{
		LambdaEx.m1();
		LambdaEx l1 = year ->year-LocalDate.now().getYear();
		int age = l1.getAge(LocalDate.now().getYear());
		System.out.println(age);
	}

}
