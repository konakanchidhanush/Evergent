package com.evergent.CoreJAVA.ExceptionHandelings;

public class MyoutOfMemory {

	public static void main(String[] args) {
		try {
int arr[]=new int[10000*210000];
System.out.println(arr);
	}
		catch(OutOfMemoryError e)
		{
			System.out.println(e.getMessage());
		}

}
}