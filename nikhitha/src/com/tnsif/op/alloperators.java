package com.tnsif.op;

public class alloperators {

	public static void main(String[] args) {
		int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("a > b && a == 10: " + (a > b && a == 10));
        System.out.println("a > b || a == 5: " + (a > b || a == 5));
        System.out.println("!(a > b): " + !(a > b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        a += b; // equivalent to a = a + b
        System.out.println("a += b: " + a);
        a -= b; // equivalent to a = a - b
        System.out.println("a -= b: " + a);

        // Increment/Decrement Operators
        System.out.println("\nIncrement/Decrement Operators:");
        a++; // increment a by 1
        System.out.println("a++: " + a);
        --a; // decrement a by 1
        System.out.println("--a:"+a);
	}

}
