package com.evergent.CoreJAVA.Strings;

public class StringBuilder1 {

	public static void main(String[] args) {
StringBuffer str1 = new StringBuffer("hello");
str1.append("Vijay");
System.out.println(str1);

str1.insert(6,"Vijay");
System.out.println(str1);
str1.delete(0,6);
System.out.println(str1);
str1.replace(0,5,"Vijay");
System.out.println(str1);
str1.reverse();
System.out.println(str1);
str1.capacity();
System.out.println(str1);
str1.length();
System.out.println(str1);

	}

}
