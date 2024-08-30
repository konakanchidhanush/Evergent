package com.evergent.CoreJAVA.ExceptionHandelings;

public class ExceptionhandlingMultiCatch {
public int k=0;
	public void myData() throws ArithmeticException,ArrayIndexOutOfBoundsException
{
	System.out.println("Started");
	int c=10/k;
	int arr[]= new int[6];
	arr[0]= 1;
	arr[1]= 1;
	arr[2]= 1;
	arr[3]= 1;
	arr[4]= 1;
	System.out.println(arr[55]);
	System.out.println("Ended");
}
public static void main(String[]args)
{
	try
	{
	ExceptionhandlingMultiCatch e = new ExceptionhandlingMultiCatch();
	e.myData();
	}
	catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		throw new ArithmeticException(e.getMessage());
	}
}
}
