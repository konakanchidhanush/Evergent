package com.evergent.CoreJAVA.Strings;


final public class PersonsImmutable 
{
	private final String name;
	private final int age ;
	PersonsImmutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void myName()
	{
		System.out.println(name);
	}
	public int myAge()
	{
		return age;
	}
	public static void main(String[] args) {
		PersonsImmutable p1= new PersonsImmutable("raj",20);
		System.out.println(p1.age);
		p1.myName();
		

	}

}
