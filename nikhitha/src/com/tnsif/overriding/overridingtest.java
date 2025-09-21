package com.tnsif.overriding;
	class Animal {
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void sound() {
	   System.out.println("cat meows");
	    }
	}
