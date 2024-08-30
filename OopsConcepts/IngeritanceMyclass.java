package com.evergent.CoreJAVA.OopsConcepts;
class Inheritance
{
public void main()
{
	System.out.println("this is superclass");
}
}
public class IngeritanceMyclass extends Inheritance {
	public void myclass()
	{
		System.out.println("hello world");
	}
public void classmy()
{
	System.out.println("hello ram");
}
public static void main(String[]args)
{
	IngeritanceMyclass h= new IngeritanceMyclass();
	h.myclass();
	h.classmy();
	h.main();

}
}
