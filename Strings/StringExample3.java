package com.evergent.CoreJAVA.Strings;

public class StringExample3 {

	public static void main(String[] args) {
StringBuilder  str =new StringBuilder();
for(int i=0;i<26;i++)
{
	char ch = ((char)('a'+i));
	str.append(ch);
	System.out.println(ch);
}
	}

}
