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

	}

}
