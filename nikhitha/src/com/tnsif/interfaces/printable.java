package com.tnsif.interfaces;

public interface printable {
	 void print();
	}
	interface Document extends printable{
	    void read();
	}
	class Report implements Document {
	    public void print() {
	        System.out.println("Printing report...");
	    }
	    public void read() {
	        System.out.println("Reading report...");
	    }
	}
