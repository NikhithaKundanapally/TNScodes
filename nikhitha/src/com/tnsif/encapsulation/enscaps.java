package com.tnsif.encapsulation;

public class enscaps {
	String colour="red";
	int seats=4;
	 String company="BMW";
	public void start() 
	{
		System.out.println("the car has started");
	}
   public void stop() 
{
	System.out.println("the car has stop");
}


	public static void main(String[] args) {
		enscaps ob =new  enscaps();
		System.out.println(ob.colour);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		ob.start();
		ob.stop();

		

	}

}
