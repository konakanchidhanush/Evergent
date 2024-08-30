package com.evergent.CoreJAVA.ExceptionHandelings;

public class StackOverFlowExample16 {

	public static void main(String[] args) {
		try {
		recursiveMethod();

	}
		catch(StackOverflowError e)
		{
			System.out.println("This is an exception: "+ e.getMessage());
		}
	}
	public static void recursiveMethod()
	{
		recursiveMethod();
	}

}
 