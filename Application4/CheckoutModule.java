package com.evergent.CoreJAVA.Dhanush.Application4;

import java.util.Random;

class CheckoutModule extends AbstractModule {
    @Override
    public void execute() {
        while (true) {
            System.out.println(" Checkout Module");
            System.out.println("======================");
            System.out.println("T - Total Amount");
            System.out.println("P - Process Payment");
            System.out.println("M - Return to Main Menu");
            System.out.println("======================");
            System.out.print("Enter your Checkout type code (T, P, M) : ");
            
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "T":
                    System.out.println("Total cost: $" + totalCost);
                    break;
                case "P":
                    processPayment();
                    break;
                case "M":
                    return;
                default:
                    System.out.println("Invalid Checkout type code.");
            }
        }
    }

    private void processPayment() {
        int amountToBePaid = totalCost;
        boolean paymentSuccess = new Random().nextBoolean(); // Randomly simulate payment success
        if (paymentSuccess) {
            System.out.println("Payment Successful! Amount Paid: $" + amountToBePaid);
            totalCost = 0;
        } else {
            System.out.println("Payment Failed. Please try again.");
        }
    }
}