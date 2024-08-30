package com.evergent.CoreJAVA.Strings;
import java.util.*;
public class Emo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2= sc.nextInt();
		int arr[][]=new int[size1][size2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			if(i==0||j==0||i==arr.length-1||j==arr.length-1||i!=j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
			System.out.println();
	}
		sc.close();
	}

}
vh