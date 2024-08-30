package com.evergent.CoreJAVA.Strings;

public class SpitDemo {

	public static void main(String[] args) {
String s1 = "The aim of java class is to learn java";
String[] word = s1.split(" ");
 for (int i = 0; i < word.length; i++) {
System.out.println(word[i]);
}
 
 for(String a : word )
 {
	 System.out.println(a);
 }
	}
}
