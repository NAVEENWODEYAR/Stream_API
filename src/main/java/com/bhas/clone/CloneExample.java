package com.bhas.clone;

public class CloneExample implements Cloneable
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		System.out.println("\nJava.lang.Cloneable interface is a marker interface.");
		CloneExample cl = new CloneExample();
		Object clone = cl.clone();
		System.out.println(cl.hashCode()+"=="+clone.hashCode());
	}

}
