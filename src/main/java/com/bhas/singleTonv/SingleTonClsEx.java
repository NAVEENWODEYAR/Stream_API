package com.bhas.singleTonv;

public class SingleTonClsEx 
{
	// Private static instance variable,
	private static SingleTonClsEx instance;
	
	// Private constructor to prevent instantiation from outside,
	private SingleTonClsEx()
	{
		System.out.println("Private Constructor!");
	}
	
	// Public method to get the singleton instance,
	public static SingleTonClsEx getInstance()
	{
		// Lazy initialization: create the instance when needed,
		if(instance ==null)
		{
			instance = new SingleTonClsEx();
		}
		return instance;
	}
	public static void main(String[] args) 
	{
		System.out.println("\n SingleTon Class - One instance and provides a global point of access to that instance.");
		System.out.println(new SingleTonClsEx().hashCode());
		System.out.println(new SingleTonClsEx().hashCode());
		System.out.println(new SingleTonClsEx().getInstance().getInstance());
	}

}
