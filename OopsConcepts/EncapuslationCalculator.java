package com.evergent.CoreJAVA.OopsConcepts;

public class EncapuslationCalculator {
	int a = 100;
	int b= 10;
	int c ;
public void addition()
{
	c=a+b;
	System.out.println("Addition of two numbers is :"+c);
}
public void multiplication()
{
	c=a*b;
	System.out.println("multiplication of two numbers is :"+c);
}
public void substraction()
{
	c=a-b;
	System.out.println("Substarction of two numbers is :"+c);
}
public void modulus()
{
	c=a%b;
	System.out.println("modulus divsion of two numbers is :"+c);
}
public void divison()
{
	c=a/b;
	System.out.println("divison of two numbers is :"+c);
}
public static void main(String[]args)
{
	EncapuslationCalculator ec = new EncapuslationCalculator();
	ec.addition();
	ec.multiplication();
	ec.substraction();
	ec.modulus();
	ec.divison();

}
}