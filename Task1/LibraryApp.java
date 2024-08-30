package com.evergent.CoreJAVA.Dhanush.Task1;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        String book = sc.next();

        if (age1 < 12 && book.equals("kids")) {
            KidUser kidUser1 = new KidUser();
            kidUser1.setAge(age1);
            kidUser1.setBookType(book);
           

            KidUser kidUser2 = new KidUser();
            kidUser2.setAge(age1);
            kidUser2.setBookType(book);
            
        } else if (age1 > 12 && book.equals("kids")) {
            AdultUser adultUser1 = new AdultUser();
            adultUser1.setAge(age1);
            adultUser1.setBookType(book);
            
        } else if (age1 > 12 && book.equals("fiction")) {
            AdultUser adultUser2 = new AdultUser();
            adultUser2.setAge(age1);
            adultUser2.setBookType(book);
           
        } else {
            System.out.println("Enter valid age!!!");
        }

        sc.close();
    }
}
