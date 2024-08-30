package com.evergent.CoreJAVA.ObjectClassMethods;


public final class PersonData
{
	private final String name;
	private final int age;
	PersonData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	/*public String toString()
	{
		return name+age;
	}
	*/
	public String myName()
	{
		return name+age;
	}
}