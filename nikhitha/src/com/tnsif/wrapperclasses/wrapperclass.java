package com.tnsif.wrapperclasses;

public class wrapperclass {

	public static void main(String[] args) {
		        // Autoboxing: Converting primitive type to wrapper class
		        int primitiveInt = 10;
		        Integer wrapperInt = Integer.valueOf(primitiveInt); // Explicit boxing
		        Integer wrapperIntAuto = primitiveInt; // Autoboxing

		        // Unboxing: Converting wrapper class to primitive type
		        Integer wrapperInt2 = Integer.valueOf(20);
		        int primitiveInt2 = wrapperInt2.intValue(); // Explicit unboxing
		        int primitiveInt2Auto = wrapperInt2; // Auto-unboxing

		        System.out.println("Primitive int: " + primitiveInt);
		        System.out.println("Wrapper Int: " + wrapperInt);
		        System.out.println("Wrapper Int Auto: " + wrapperIntAuto);
		        System.out.println("Primitive int2: " + primitiveInt2);
		        System.out.println("Primitive int2 Auto: " + primitiveInt2Auto);

		        // Using wrapper class methods
		        System.out.println("Max int value: " + Integer.MAX_VALUE);
		        System.out.println("Min int value: " + Integer.MIN_VALUE);
		        System.out.println("String to int: " + Integer.parseInt("25"));
		    }
		}

