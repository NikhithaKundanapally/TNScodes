package com.tnsif.overriding;

public class overridingtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;

        a = new Dog();   // Upcasting
        a.sound();       // Dog’s version

        a = new Cat();
        a.sound();       // Cat’s version
  

	}

}
