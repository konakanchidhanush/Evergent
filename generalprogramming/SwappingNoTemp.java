package com.evergent.CoreJAVA.generalprogramming;
import java.util.*;
public class SwappingNoTemp {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.print(a+" "+b);
	sc.close();
}
}
