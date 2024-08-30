package com.evergent.CoreJAVA.OopsConcepts;

public class TypesOfMethodCreation {

	public void display()
	{
		System.out.println("The above method is created without paramenters and return type");
	}
	
	public int mydata( )
	{
		return 100;
	}
	public void display1(int a, int b)
	{
		System.out.println("Parameters without retrun type: "+a+b);
	}
	public int mydata1(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		TypesOfMethodCreation m1= new TypesOfMethodCreation();
		m1.display();
		m1.mydata();
		m1.display1(10, 200);
		int a=m1.mydata1(10, 20);
		System.out.println(a);

	}

}
