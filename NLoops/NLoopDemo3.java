package com.evergent.CoreJAVA.NLoops;

public class NLoopDemo3 {

	public static void main(String[] args) {
		int n=1;
		int space=4;
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "+n);
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			space--;
			n++;
			num++;
		}

	}

}
