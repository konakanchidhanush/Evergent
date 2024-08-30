package com.evergent.CoreJAVA.Constructor;

public class Employee5 {
int age;
String name;
	Employee5()
	{
		System.out.println("this is default constructor");
	}
	Employee5(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	Employee5(String name)
	{
		this(name,40);
	}
	public void display()
	{
		System.out.println(name+age);
	}
	public static void main(String[] args) {
		Employee5 e5 = new Employee5("ram");
		e5.display();
		Employee5 e6 = new Employee5("ram");
		e6.display();

	}

}
