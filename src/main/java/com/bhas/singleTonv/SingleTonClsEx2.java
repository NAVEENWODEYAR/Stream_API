package com.bhas.singleTonv;

public class SingleTonClsEx2 
{
	public static void main(String[] args) 
	{
		System.out.println("\n SingleTon Class - One instance and provides a global point of access to that instance.");
		SingleTonClsEx s = SingleTonClsEx.getInstance();
		SingleTonClsEx s1 = SingleTonClsEx.getInstance();
		SingleTonClsEx s2 = SingleTonClsEx.getInstance();
		SingleTonClsEx s3 = SingleTonClsEx.getInstance();
		
		System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3);
	}

}
