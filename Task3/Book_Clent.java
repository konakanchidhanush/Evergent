package com.evergent.CoreJAVA.Dhanush.Task3;

import java.util.Scanner;
import java.util.Set;
 
public class Book_Clent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookInterface book=new BookImp();
		for(;;){
			System.out.println("1. Add Book 2.Search by isbn 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the isbn");
				   String isbn=sc.next();
				   System.out.println("Enter the book name");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Book b=new Book();
				   b.setIsbn(isbn);
				   b.setBookName(name);
				   b.setPrice(price);
				   String message=book.addBook(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the isbn");
			   	   String isb=sc.next();
			   	   book.searchByIsbn(isb);
			   	   break;
			  			
			case 3:book.getAllBooks();
				break;
			case 4:System.exit(0);
			}
			
		}
	}
}
	
