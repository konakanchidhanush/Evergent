package com.evergent.CoreJAVA.Strings;

public class Emo3 {
	String name;
	String id;
Emo3(String name,String id)
{
	this.name=name;
	this.id=id;
}
Emo3(Emo3 e)
{
	this.name=e.name;
	this.id=e.id;

}
public void show()
{
	System.out.println(name+id);
}
public static void main(String[]args)
{
	Emo3 e= new Emo3("Hi","hello");
	Emo3 e1= new Emo3(e);
	e.show();
	e1.show();
}
{
	
}
}
