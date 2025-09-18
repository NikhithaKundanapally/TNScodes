package com.tnsif.getset;
class Animal
{
	//private field
	private int age;
	//getter method
	public int getAge()
	{
		return age;
	}
	//setter method
	public void setAge(int age)
	{
		this.age=age;
	}
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		a1.setAge(12);
		System.out.println("animal age is:"+a1.getAge());
		

	}

}
