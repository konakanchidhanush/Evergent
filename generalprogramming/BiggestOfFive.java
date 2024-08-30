package com.evergent.CoreJAVA.generalprogramming;

import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		if(a>b && a>c && a>d && a>e )
		{
			System.out.println("A is greater");
		}
		else if(b>a&&b>c&&b>d&&b>e)
		{
			System.out.println("B is greater");
		}
		else if(c>a&&c>b&&c>d&&c>e)
		{
			System.out.println("C is greater");
		}
		else if(d>a&&d>b&&d>c&&d>e)
		{
			System.out.println("D is greater");
		}
		else
		{
			System.out.println("E is greater");
		}
		
sc.close();
	}
}
