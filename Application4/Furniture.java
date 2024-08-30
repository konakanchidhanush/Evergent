package com.evergent.CoreJAVA.Dhanush.Application4;

import java.util.*;
class Furniture implements Product {
	Scanner scanner = new Scanner(System.in);
    @Override
    public void showProducts() {
        System.out.println("Furniture:");
        System.out.println("1 - Sofa (Cost: $500)");
        System.out.println("2 - Dining Table (Cost: $300)");
        System.out.print("Enter your choice (1, 2): ");
        
      
		int choice = Integer.parseInt(scanner.nextLine());
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
                if (count<=5) {
                	productCost = 300 * count;	
				}
                else
                {
                	productCost = 200 * count;	

                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
		if(count<=5) {
		System.out.println("=-------------------------------------------------");
		System.out.println("To avail the discount you need to add more items.");	
        System.out.println("Product cost: $" + productCost);
		System.out.println("=-------------------------------------------------");

		}
		else
		{		System.out.println("=-------------------------------------------------");

			System.out.println("Congratulations you are eligible for special discount");
			System.out.println("Product cost after disount: $" + productCost);
			System.out.println("=-------------------------------------------------");

		}
        AbstractModule.totalCost += productCost; // Accumulate total cost
    }

    @Override
    public int calculateCost(int count) {
    	if(count>5) {
        return 300 * count;
    }
    	else
    	{
    		return 500*count;
    	}
    }
    		
}
