package com.evergent.CoreJAVA.Booking;

import java.util.ArrayList;

public class BookingDAO {
	
	                       
	public int addBooking(BookingBean bookBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(bookBean.getBookId());
			bookList.add(bookBean.getTitle());
			bookList.add(bookBean.getMembers());
			bookList.add(bookBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("Booking ID :"+bookBean.getBookId());
			System.out.println("Booking To? :"+bookBean.getTitle());
			System.out.println("Number of Passengers: :"+bookBean.getMembers());
			System.out.println("Booking Status :"+bookBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
