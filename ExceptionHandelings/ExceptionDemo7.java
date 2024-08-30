package com.evergent.CoreJAVA.ExceptionHandelings;

public class ExceptionDemo7 {
int k=0;
	public void myData()// throws Exception
	{
		System.out.println(10/k);
	}
	public static void main(String[] args) {
try
{
	ExceptionDemo7 e = new ExceptionDemo7();
	e.myData();
}
catch (Exception e) {
	System.out.println(e);
}
	}

}
