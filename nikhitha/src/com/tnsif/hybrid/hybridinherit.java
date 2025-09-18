package com.tnsif.hybrid;
class Person {
	   void displayPerson() {
	       System.out.println("I am a person.");
	   }
	}

	class Student5 extends Person {
	   void displayStudent() {
	       System.out.println("I am a student.");
	   }
	}

	interface Sports {
	   void displaySports();
	}

	interface Skills {
	   void displaySkills();
	}

	class StudentAthlete extends Student5 implements Sports , Skills {
	   public void displaySports() {
	       System.out.println("I play football.");
	 }
	   
	   public void displaySkills() {
	       System.out.println("I have leadership skills.");
	   }
	   
	   void displayAthlete() {
		   System.out.println("I am a Student Athlete.");
}
	}

public class hybridinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentAthlete sa = new StudentAthlete();
		 sa.displayPerson();
		 sa.displayStudent();
        sa.displaySports();
	     sa.displaySkills();
        sa.displayAthlete();



	}

}
