package com.evergent.CoreJAVA.ExceptionHandelings;


public class ExceptionDemo6 {
		
		public static void main(String[] args) {
			String name=null;
			int k=0;
			try
			{
			System.out.println("one");
			System.out.println(name.length());
			System.out.println(10/k);
			System.out.println("end");
			}
finally
{
	System.out.println("This is the final block followed by the try block");
}
		}

	}
