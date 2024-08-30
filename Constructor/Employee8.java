package com.evergent.CoreJAVA.Constructor;

class Animal
{
	private String name;
	private int age;
	Animal()
	{
		System.out.println("This is the default constrctor");
	}
	Animal(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public void display()
	{
		System.out.println(age);
		System.out.println(name);
	}
}
class Dog extends Animal
{
	private String breed;
	Dog()
	{
		System.out.println("this is default constructor");
	}
	Dog(String breed,String name,int age)
	{
		super(name,age);
		this.breed=breed;
	}
	public void display()
	{
		super.display();
		System.out.println(breed);
	}
}
public class Employee8 {

	public static void main(String[] args) {
	Dog d = new Dog("Buddy","Pug",20);
	d.display();
	}

}
