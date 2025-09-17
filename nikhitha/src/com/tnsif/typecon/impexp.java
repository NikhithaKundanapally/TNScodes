package com.tnsif.typecon;

public class impexp {

	public static void main(String[] args) {
		int intValue=100;// Implicit type conversion (widening)
		double doubleValue=intValue;
		System.out.println("implicit conversion:int to double");
		System.out.println("intvalue:"+ intValue);
		System.out.println("doubleValue:"+doubleValue);
		
		double doubleValue2=150.75;
		int intValue2=(int) doubleValue2;
		System.out.println("\nExplicit conversion: double to int");
		System.out.println("doubleValue2:" + doubleValue2);
		System.out.println("intValue2:" + intValue2);
		
		
		
	}
}
