package com.evergent.CoreJAVA.OopsConcepts;

public class HasARealationship {

	public void hello()
	{
		System.out.println("local member");
	}
	
	public static void main(String[] args) {

		HasARealationship h = new HasARealationship();
		h.hello();
		Abc a = new Abc();
		a.userid();
	}

}
