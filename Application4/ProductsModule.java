package com.evergent.CoreJAVA.Dhanush.Application4;


class ProductsModule extends AbstractModule {	
	@Override
	    public void execute() {
	        while (true) {
	            System.out.println(" Products Module");
	            System.out.println("======================");
	            System.out.println("E - Electronics");
	            System.out.println("F - Furniture");
	            System.out.println("C - Clothing");
	            System.out.println("M - Return to Main Menu");
	            System.out.println("======================");
	            System.out.print("Enter your Product type code (E, F, C, M) : ");
	            
	            String choice = scanner.nextLine().toUpperCase();
	            switch (choice) {
	                case "E":
	                    Product electronics = new Electronics();
	                    electronics.showProducts();
	                    break;
	                case "F":
	                    Product furniture = new Furniture();
	                    furniture.showProducts();
	                    break;
	                case "C":
	                    Product clothing = new Clothing();
	                    clothing.showProducts();
	                    break;
	                case "M":
	                    return;
	                default:
	                    System.out.println("Invalid Product type code.");
	            }
	        }
	    }
	}


