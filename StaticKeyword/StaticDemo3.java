package com.evergent.CoreJAVA.StaticKeyword;

public class StaticDemo3 {
static String ename="Ramesh";
String name="Surya";
public static void show1()
{
	System.out.println("this is a static method");
}
public void display()
{
	System.out.println("This is a nonstatic method");
}
	public static void main(String[] args) {
show1();
StaticDemo3 sd3 = new StaticDemo3();
sd3.display();
	}
}
