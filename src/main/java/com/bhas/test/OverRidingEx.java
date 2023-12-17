package com.bhas.test;

public class OverRidingEx extends OverLoadingEx {

	@Override
	 void m1()
	 {
		 System.out.println("OverRidingEx:Method");
	 }
	public static void main(String[] args) {
		
		new OverRidingEx().m1();
	}

}
