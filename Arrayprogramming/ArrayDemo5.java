package com.evergent.CoreJAVA.Arrayprogramming;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = 7;
				} else {
					arr[i][j] = 0;
				}
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
