package com.evergent.CoreJAVA.Astract;

public class Person5 extends Person4 {
	String name;
	Person5(String name)
	{
		this.name=name;
		System.out.println(name);
		System.out.println("this is the local constructor");
	}

	@Override
	public void myProduct() {
		System.out.println("this is the local method of this method person4");
	}public static void main(String[]args)
{
		Person4 p = new Person5("hello");
		p.myProduct();

}
	}


