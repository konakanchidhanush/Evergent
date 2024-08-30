package com.evergent.CoreJAVA.logicalprogramming;

public class FIbonacciDemo2 {
public static void main(String[]args)
{
	int sum=0;
	int a=0;
	int b=1;
	for(int i=1;i<=10;i++)
	{
		System.out.println(sum);
		a=b;
		b=sum;
		sum=a+b;
	}
}
}
