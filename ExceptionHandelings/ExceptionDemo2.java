package com.evergent.CoreJAVA.ExceptionHandelings;

public class ExceptionDemo2 {
		String name="null";
		
		public static void main(String[] args) {
			try
			{
			
			System.out.println(name.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			
		}

	}
