package com.tnsif.abstact;

abstract class vehicle
{

	//abstract methods
	abstract void move();
	abstract void carry();
	//concrete method
	void label()
	{
	  System.out.println("vehicle data:");
	}
}
     class Bus extends vehicle
     {
       void move()
       {
    	 
    		 System.out.println("Moves by petrol");
     }
    	 void carry()
    	 {
    		 System.out.println("carries passengers");
    	 }
     }
    
     class truck extends vehicle
     {
    	 void move()
    	 {
    		 System.out.println("Moves by diesel");
    	 }
    	 void carry()
    	 {
    		 System.out.println("carry goods");
    	 }
     }

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle bus=new Bus();
		bus.label();
		bus.move();
		bus.carry();
	}
}



   


