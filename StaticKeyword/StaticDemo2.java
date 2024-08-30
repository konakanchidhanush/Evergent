package com.evergent.CoreJAVA.StaticKeyword;

public class StaticDemo2 {
static String name= "Rajesh";
String ename = "India";
static public void show()
{
	System.out.println("this is non static method");
}
	public static void main(String[] args) {
System.out.println("This is main method");
show();
System.out.println(StaticDemo2.name);
	}

}
