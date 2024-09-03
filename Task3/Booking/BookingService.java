package com.evergent.CoreJAVA.Booking;
public class BookingService {
	                           //100      corejava    250
	public int addBookingService(int bookId,String title,int members)
	{  String grade="";
	
	   if(members<=0)
	   {
		   grade = "Tickets NOT Booked Enter valid Number of Passengers";
	   }
	   else if(members>=1&&members<=20)
	   {
		   grade = "Ticket Booked successfully";
		   
	   }
	   else
	   {
		   grade = "Ticket Booked succesfully for 7 members";
	   }
		
		
		BookingDAO bookDAO = new BookingDAO();
		BookingBean bookBean=new BookingBean();
	       bookBean.setBookId(bookId);	
	       bookBean.setTitle(title);
	       bookBean.setMembers(members);;
	       bookBean.setGrade(grade);
	
		   int updateResult= bookDAO.addBooking(bookBean);
		
		return 1;
	} 
}
