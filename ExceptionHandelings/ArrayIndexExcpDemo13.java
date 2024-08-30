package com.evergent.CoreJAVA.ExceptionHandelings;

public class ArrayIndexExcpDemo13 {
int arr[]= {1,2,3,4,5};
public static void main(String[]args)
{
	
	try {
		ArrayIndexExcpDemo13 e = new ArrayIndexExcpDemo13();
		System.out.println(e.arr[10]);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
