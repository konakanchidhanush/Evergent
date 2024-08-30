package com.evergent.CoreJAVA.Constructor;

public class Employee2 {
	int age;
	String name;
	int eid;
Employee2()
{
	System.out.println("Default constaructor");
}
	Employee2(int eid1,String name1,int age1)
{
	System.out.println("hello bro how are you");
	age=age1;
	name=name1;
	age=age1;
}
	public void display()
	{
	System.out.println(age+name+eid);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 a=new Employee2(2,"hello",20);
		a.display();
	}

}
