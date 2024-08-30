package com.evergent.CoreJAVA.Arrayprogramming;

public class ArrayDemo8 {

	public static void main(String[] args) {
		String arr[][]= new String[5][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]="java";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
