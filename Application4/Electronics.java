package com.evergent.CoreJAVA.Dhanush.Application4;

import java.util.*;
	class Electronics implements Product {
	   
Scanner scanner = new Scanner(System.in);
		@Override
	    public void showProducts() {
	        System.out.println("Electronics:");
	        System.out.println("1 - Laptop (Cost: $1000)");
	        System.out.println("2 - Smartphone (Cost: $800)");
	        System.out.print("Enter your choice (1, 2): ");
	        

			int choice = scanner.nextInt();
	        int count = 0;
	        int productCost;
			switch (choice) {
	            case 1:
	                System.out.print("Enter the number of items: ");
	                count = scanner.nextInt();
	                scanner.nextLine();  // Consume the newline
	                productCost = calculateCost(count);
	                break;
	            case 2:
	                System.out.print("Enter the number of items: ");
	                count = scanner.nextInt();
	                scanner.nextLine();  // Consume the newline
	                productCost = 800 * count;
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return;
	        }
	        System.out.println("Discount will be automaticaly applicable as per products Product cost: $" + productCost);
	        AbstractModule.totalCost += productCost; // Accumulate total cost
	    }

	    @Override
	    public int calculateCost(int count) {
	    	if(count<=5)
	    	{
	        return 1000 * count;
	    }
	    	else
	    	{
		        return 800 * count;

	    	}
	    }
	}

	


