package com.evergent.CoreJAVA.ExceptionHandelings;
import java.io.*;
import java.util.*;
public class FileNotFoundExcpDemo15 {
public static void main(String[]args)
{
	try {
	File file= new File("C:\Users\dhanush.konkanchi\Desktop\eclipse-2023-03\Conceptques.docx");
	Scanner sc = new Scanner(f);
	while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
}
}
