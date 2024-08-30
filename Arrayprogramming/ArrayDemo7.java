package com.evergent.CoreJAVA.Arrayprogramming;

public class ArrayDemo7 {

	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((i==0)||(j==0)||(i==4)||(j==4))
				{
					arr[i][j]=7;
				}
				else
				{
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
		System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
