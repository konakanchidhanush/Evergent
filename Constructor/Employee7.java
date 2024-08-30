package com.evergent.CoreJAVA.Constructor;

public class Employee7 {
int age;
String name;
	Employee7()
	{
		age=20;
		name="ram";
	}
	Employee7(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		Employee7 e7 = new Employee7();
		e7.display();
		Employee7 e8 = new Employee7(77,"Suyra");
		e8.display();

	}

}
