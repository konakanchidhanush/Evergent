package com.evergent.CoreJAVA.ExceptionHandelings;


public class ExceptiondDemo8throws {
String name = null;
	public void myData() throws Exception
{
	System.out.println("Start");
	System.out.println(name.length());
	System.out.println("End");
}
	public void myInfo() throws Exception 
	{
		myData();
		System.out.println("This is local method");
	}
	public static void main(String[]args)
	{
		try {
		ExceptiondDemo8throws e = new ExceptiondDemo8throws();
		e.myInfo();
		}
		catch(Exception e)
		{
			throw new IllegalArgumentException("gj");		}
	}
}
