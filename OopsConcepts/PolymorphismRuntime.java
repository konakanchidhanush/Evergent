package com.evergent.CoreJAVA.OopsConcepts;

class Abc
{
	public void userid()
	{
		System.out.println("This is the superclass method");
	}
}
class Bcd extends Abc
{
	public void userid1()
	{
		System.out.println("This is the sub class method");
	}
}
public class PolymorphismRuntime {
	public static void main(String[] args) {
		Abc r = new Bcd();//upcasting
		r.userid();
		Bcd b = (Bcd)r;//downcasting
		b.userid1();
	}

}