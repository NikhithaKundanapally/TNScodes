package com.tnsif.interfaces;

public interface InfDemo {
	int a=10;
	void display();//final and static
}
class imple implements InfDemo{
	public void display()
	{
		System.out.println("this is implementary class of Interface");
		
	}

}
