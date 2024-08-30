package com.evergent.CoreJAVA.Constructor;

public class Employee3 {
	int age;
	String name;
	int eid;
Employee3()
{
	System.out.println("Default constaructor");
}
	Employee3(int eid,String name,int age)
{
	System.out.println("hello bro how are you");
	this.age=age;
	this.name=name;
	this.age=age;
}
	public void display()
	{
	System.out.println(age+name+eid);
	}

	public static void main(String[] args) {
		new Employee3();
		Employee3 a=new Employee3(2,"hello",20);
		a.display();
	}

}
