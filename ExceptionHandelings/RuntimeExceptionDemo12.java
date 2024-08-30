package com.evergent.CoreJAVA.ExceptionHandelings;

class RunTimeException extends RuntimeException {
	
	RunTimeException(String message)
	{
		super(message);
	}

}
public class RuntimeExceptionDemo12 
{public static  String message;
public static String  message1 = "name";
	public static void display() throws RunTimeException
	{
	
		System.out.println("This is a runtime exception error");
		if(message.equals(message1) )
		{
			throw new RunTimeException("this is not possible");
		}
		else
		{
			System.out.println("The matter is clear no exception");
		}
	}
public static void main(String[]args)
{
	try {
		display();
		}
	catch(RunTimeException e)
	{
		System.out.println(e.getMessage());
	}
}
}
