package com.evergent.CoreJAVA.logicalprogramming;

public class SwppingOfTwoNumbersDemo {

	public static void main(String[] args) {
		int a =5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The numbers after Swapping are: "+a+","+b);

	}
}
