package com.evergent.CoreJAVA.ExceptionHandelings;


public class ExceptionDemo4 {
		
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
			catch (ArithmeticException e) {
				System.out.println("this  "+e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			finally
			{
				System.out.println("This is the final block it executes with or without error");
			}
			
		}

	}
