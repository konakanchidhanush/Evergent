package com.evergent.CoreJAVA.logicalprogramming;

public class SwappingUsingTemp {

	public static void main(String[] args) {
	int a = 5;
	int b=10;
	int temp;
	temp=a;
	a=b;
	b=temp;
System.out.println("This is using temp variable we swapped numbers: "+a+","+b);
	}

}
