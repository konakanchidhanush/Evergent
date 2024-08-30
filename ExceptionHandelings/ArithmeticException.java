package com.evergent.CoreJAVA.ExceptionHandelings;

public class ArithmeticException extends Throwable {

	public static void main(String[] args) {
	    try {
	        int a = 10 / 0;
	    } 
	   
	    catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	    catch (ArithmeticException e) {
	        System.out.println(e);
	    } 
	}

}
