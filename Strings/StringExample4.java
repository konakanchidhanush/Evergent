package com.evergent.CoreJAVA.Strings;

import java.util.Arrays;

public class StringExample4 {

	public static void main(String[] args) {
String name = "JAVATECHNOLOGY";
System.out.println(Arrays.toString(name.toCharArray()));
System.out.println(name.indexOf('T'));
String s = "   JAVA   ";
System.out.println(s.strip());
	}

}
