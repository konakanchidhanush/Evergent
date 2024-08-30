package com.evergent.CoreJAVA.Astract;

abstract public class Person2 extends Person1 {
public String age;

@Override
public void myProduct() {	
	System.out.println(age);
	System.out.println("This method is from person2 class");
}

public Person2(String age) {
	this.age=age;
}
public static void main(String[]args)
{
	Person1 p =new Person3("22");
	p.myProduct();
	p.newProduct();
}
}
