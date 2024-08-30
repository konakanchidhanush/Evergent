package com.evergent.CoreJAVA.Strings;

public class StringDemo4 {

    public static void main(String[] args) {
        String str1 = "The fox is in the forest";
        // Create a StringBuilder from the string
        StringBuilder sb = new StringBuilder(str1);
        // Reverse the StringBuilder
        sb.reverse();
        // Print the reversed string
        System.out.println(sb.toString());
    }
}
