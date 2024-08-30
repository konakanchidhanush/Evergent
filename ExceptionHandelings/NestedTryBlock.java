package com.evergent.CoreJAVA.ExceptionHandelings;

public class NestedTryBlock  extends Exception{
	private String message;
	NestedTryBlock(String message)
	{
		this.message=message;
		System.out.println(message);
	}
public static void myData() throws NestedTryBlock
{
	int age =5;
	if(age==5)
	{
		throw new NestedTryBlock("Hello");
	}
	else
	{
		System.out.println("Bye");
	}
}
	public static void main(String[]args)
{
		try
		{
			NestedTryBlock.myData();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}
