package com.evergent.CoreJAVA.ExceptionHandelings;


public class ExceptionDemo3 {
		
		public static void main(String[] args) {
			String name="null";
			int k=0;
			try
			{
			System.out.println("one");
			System.out.println(name.length());
			System.out.println(10/k);
			System.out.println("end");
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			catch (ArithmeticException e) {
				System.out.println("this  "+e);
			}
			
		}

	}
