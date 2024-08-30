package com.evergent.CoreJAVA.Constructor;

public class Employee9 {
	String name;
	int year;
	int number;
	Employee9()
	{
		System.out.println("This is the default constructor");
	}
	Employee9(String name,int year)
	{
		this(name,year,8080);
	}
	Employee9(String name,int year,int number)
	{
	  this.name=name;
	  this.year=year;
	  this.number=number;
	}
	Employee9(String name)
	{
		this(name,500);
	}
	public void display()
	{
		System.out.println(name+" "+year+" "+number);
	}
	public static void main(String[] args) {
		Employee9 c = new Employee9("Toyota",2022);
c.display();
Employee9 c1= new Employee9("Honda");
c1.display();
Employee9 c2= new Employee9("Honda");
c2.display();


	}

}

