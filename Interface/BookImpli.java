package com.evergent.CoreJAVA.Interface;

public class BookImpli implements Book,Book1{

	@Override
	public void bookAuthor() {
	System.out.println("Oracle");
	}

	@Override
	public void bookTitle() {
		System.out.println("Naa savu nenu sastha neeku enduku");
		
	}

	@Override
	public void bookPrice() {
		System.out.println("Free");
	}
		public static void main(String[] args) {
			BookImpli b= new BookImpli();
			b.bookAuthor();
			b.bookPrice();
			b.bookTitle();
			b.bookIndex();
			b.bookPages();
			

		}

		@Override
		public void bookIndex() {
System.out.println("Index pages");			
		}

		@Override
		public void bookPages() {
			System.out.println("100");
			
		}
	}

