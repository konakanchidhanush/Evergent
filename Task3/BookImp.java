package com.evergent.CoreJAVA.Dhanush.Task3;


import java.util.HashSet;
import java.util.Set;

public class BookImp implements BookInterface {
	Set<Book> bookSet=null;
	public BookImp() {
		bookSet=new HashSet<Book>();
	}
	
	@Override
	public String addBook(Book b) {
		bookSet.add(b);
		return b.getIsbn();
	} 

	@Override
	public void searchByIsbn(String isbn) {
		boolean b=false;
		if(bookSet.size()>0 && bookSet!=null){
			for(Book book:bookSet){
				if(book.getIsbn().equals(isbn)){
					System.out.println(book.getIsbn()+" "+book.getBookName()+" "+book.getPrice());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The book is not found");
			
	}

	@Override
	public void  getAllBooks() {
			if(bookSet.size()>0){
				for(Book book:bookSet){
					System.out.println(book.getIsbn()+" "+book.getBookName()+" "+book.getPrice());
				}
					
			}else{
				System.out.println("No books are available");
			}
	}

}
