package com.evergent.CoreJAVA.Booking;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int bookId=0;
		String title="";
		int members=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Booking Registration ID :");
		bookId=sin.nextInt();
		System.out.println(("Enter Booking Station : "));
		title = sin.next();
		System.out.println("Enter Number of passengers");
		members = sin.nextInt();
		
		BookingService bookService = new BookingService();
		
		int updeateCount=bookService.addBookingService(bookId,title,members);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record Success");
		
		
		
		
	}

}
