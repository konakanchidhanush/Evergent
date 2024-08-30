package com.evergent.CoreJAVA.StaticKeyword;

public class StaticDemo5 {
static String ename="Ramesh";
String name="India";
public static void show1()
{
	System.out.println("this is a static method");
}
static {
	System.out.println("Welome raaa.........");
}
public void display()
{
	System.out.println("This is a nonstatic method");
}
	public static void main(String[] args) {
show1();
StaticDemo5 sd3 = new StaticDemo5();
sd3.display();
	}
}
