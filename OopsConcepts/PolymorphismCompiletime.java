package com.evergent.CoreJAVA.OopsConcepts;

public class PolymorphismCompiletime {
	public void userid()
	{
		System.out.println("please enter the user details");
	}
	public void userid(int age,long mobile)
	{
		System.out.println("the age of the employee is: "+age);
		System.out.println("the mobile number of the employee is: "+mobile);
	}
	public void userid(String name, String address)
	{
		System.out.println("The name of the employee is: "+name);
		System.out.println("The address of the employee is: "+address);
	}
	public static void main(String[]args)
	{
		PolymorphismCompiletime p= new PolymorphismCompiletime();
		p.userid();
		p.userid(20, 9234679200L);
		p.userid("HARI", "Hyderabad");
	}
}
