package com.evergent.CoreJAVA.FinalKeyword;

public class FinalDemo2 {
final String name= "Surya";
//final public void show()
{
System.out.println("hello");
}
public static void main(String[] args) {
	//ename="Surya";
	System.out.println("This variable cant be reinitialised");
	FinalDemo2 fd2=new FinalDemo2();
	fd2.show();
	Myclass mc = new Myclass();
	mc.show();
	}

}

class Myclass extends FinalDemo2	
{
public void show()
{
	System.out.println("hi");
}
}
	