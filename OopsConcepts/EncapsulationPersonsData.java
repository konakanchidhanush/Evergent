package com.evergent.CoreJAVA.OopsConcepts;

public class EncapsulationPersonsData {

	int age = 30;
	String s = "Ram";
	String b= "Hyderabad, nanakramguda";
	public void display()
	{
		System.out.println("The Name of the employee is: "+s);
		System.out.println("The age of the employee is: "+age);
		System.out.println("The Address of the employee is: "+b);
	}
	public static void main(String[] args) {
		EncapsulationPersonsData h1= new EncapsulationPersonsData();
		h1.display();

	}

}
