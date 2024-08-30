package com.evergent.CoreJAVA.generalprogramming;

enum Car{
	bmw,audi,splendor
}
public class EnumDemo {
	public static void main(String[]args)
	{
		Car c =Car.bmw;
		switch()
		{
		case c : System.out.println("hello");
		}
	}
}
