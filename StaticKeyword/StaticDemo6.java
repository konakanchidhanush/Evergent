package com.evergent.CoreJAVA.StaticKeyword;

public class StaticDemo6 {
static String name="Surya";
String ename="Indian";
public void show(){
	name="Pakistan";
	System.out.println("This is a non static method");
	System.out.println(name);
}
public static void display()
{
	System.out.println(name);
}
public static void main(String[]args)
{
	System.out.println("This is the main method");
	StaticDemo6 sd6= new StaticDemo6();
	sd6.show();
	System.out.println(sd6.name);
	System.out.println(StaticDemo6.name);
	StaticDemo6 sd7= new StaticDemo6();
	sd7.show();
	StaticDemo6.display();
	
	
}
}