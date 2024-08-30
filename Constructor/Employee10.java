package com.evergent.CoreJAVA.Constructor;

public class Employee10 {
String name;
int age;
	Employee10()
	{
		System.out.println("This is a default onstructor");
	}
	Employee10(String name,int age)
	{
			this.name=name;
			this.age=age;
	}
	Employee10(Employee10 s)
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Employee10 e10 = new Employee10("surya",100);
		e10.display();
		Employee10 e11 = new Employee10(e10);
		e11.display();

	}

}
