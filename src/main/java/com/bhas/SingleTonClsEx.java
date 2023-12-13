package com.bhas;

public class SingleTonClsEx 
{
	// Private static instance variable,
	private static SingleTonClsEx instance;
	
	// Private constructor to prevent instantiation from outside,
	private SingleTonClsEx()
	{
		
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
		System.out.println("\n one instance and provides a global point of access to that instance.");
	}

}
