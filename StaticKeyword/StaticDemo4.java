package com.evergent.CoreJAVA.StaticKeyword;

public class StaticDemo4 {
static String ename="Ramesh";
String name="India";
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
StaticDemo4 sd3 = new StaticDemo4();
sd3.display();
	}
}
