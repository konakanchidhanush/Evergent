package com.evergent.CoreJAVA.ExceptionHandelings;

public class ExceptionUserDefinedDemo10 extends Exception {


	// Constructor that accepts a custom message
    public ExceptionUserDefinedDemo10(String message) {
        System.out.println("hello:"+message);;
    }
    public static void validateAge(int age) throws ExceptionUserDefinedDemo10 {
        if (age < 18 || age > 100) { // Modified condition for meaningful validation
            throw new ExceptionUserDefinedDemo10("Age must be between 18 and 100.");
        }
        System.out.println("Age is valid.");
    }
    public static void main(String[] args) {
        try {
            validateAge(229); // This will trigger the exception
        } catch (ExceptionUserDefinedDemo10 e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


