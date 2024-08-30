package com.evergent.CoreJAVA.Arrayprogramming;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++)
			{
			arr[i][j] = 7;
		}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
