package com.evergnet.CoreJAVA.Dhanush.Application2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Tegver {
    enum Module {P, O, S, C, Q}
    enum ProductType {E, F, C}
    enum OrderType {V, M}
    enum ShoppingCartType {A, R, M}
    enum CheckoutType {T, P, M}

    static int productCost = 0;
    static int totalCost = 0;
    static int amountToBePaid = 0;
    static int count = 0;
    static Random random = new Random();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String module;

        System.out.println("\n\t\t  Welcome To TEGVER");

        while (true) {
            System.out.println("======================");
            System.out.println(" Tegver Main Menu");
            System.out.println("======================");
            System.out.println("P - Products Module");
            System.out.println("O - Orders Module");
            System.out.println("S - Shopping Cart Module");
            System.out.println("C - Checkout Module");
            System.out.println("Q - Quit Module");
            System.out.println("======================");
            System.out.print("Enter your Module code (P, O, S, C, Q) : ");

            module = scanner.nextLine().toUpperCase();
            System.out.println("You entered module is  : " + module);

            try {
                switch (Module.valueOf(module)) {
                    case P:
                        while (true) {
                            System.out.println(" Products Module");
                            System.out.println("======================");
                            System.out.println("E - Electronics");
                            System.out.println("F - Furniture");
                            System.out.println("C - Clothing");
                            System.out.println("M - Return to Main Menu");
                            System.out.println("======================");
                            System.out.print("Enter your Product type code (E, F, C, M) : ");
                            
                            module = scanner.nextLine().toUpperCase();
                            if (module.equals("M")) break;

                            if (module.equals("E")) {
                                System.out.println("Electronics:");
                                System.out.println("1 - Laptop (Cost: $1000)");
                                System.out.println("2 - Smartphone (Cost: $800)");
                                System.out.print("Enter your choice (1, 2): ");
                                int electronicsChoice = Integer.parseInt(scanner.nextLine());
                                if (electronicsChoice == 1) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 1000 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else if (electronicsChoice == 2) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 800 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                            } else if (module.equals("F")) {
                                System.out.println("Furniture:");
                                System.out.println("1 - Sofa (Cost: $500)");
                                System.out.println("2 - Dining Table (Cost: $300)");
                                System.out.print("Enter your choice (1, 2): ");
                                int furnitureChoice = Integer.parseInt(scanner.nextLine());
                                if (furnitureChoice == 1) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 500 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else if (furnitureChoice == 2) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 300 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                            } else if (module.equals("C")) {
                                System.out.println("Clothing:");
                                System.out.println("1 - Jacket (Cost: $100)");
                                System.out.println("2 - Jeans (Cost: $60)");
                                System.out.print("Enter your choice (1, 2): ");
                                int clothingChoice = Integer.parseInt(scanner.nextLine());
                                if (clothingChoice == 1) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 100 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else if (clothingChoice == 2) {
                                    System.out.print("Enter the number of items: ");
                                    count = scanner.nextInt();
                                    scanner.nextLine();  // Consume the newline
                                    productCost = 60 * count;
                                    totalCost += productCost; // Accumulate total cost
                                    System.out.println("product cost: $" + productCost);
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                            } else {
                                System.out.println("Invalid Product type code.");
                            }
                        }
                        break;

                    case O:
                        while (true) {
                            System.out.println(" Orders Module");
                            System.out.println("======================");
                            System.out.println("V - View Orders");
                            System.out.println("M - Manage Orders");
                            System.out.println("R - Return to Main Menu");
                            System.out.println("======================");
                            System.out.print("Enter your Order type code (V, M, R) : ");
                            
                            module = scanner.nextLine().toUpperCase();
                            if (module.equals("R")) break;

                            if (module.equals("V")) {
                                System.out.println("Viewing Orders...");
                                // Placeholder for orders logic
                            } else if (module.equals("M")) {
                                System.out.println("Managing Orders...");
                                // Placeholder for order management logic
                            } else {
                                System.out.println("Invalid Order type code.");
                            }
                        }
                        break;

                    case S:
                        while (true) {
                            System.out.println(" Shopping Cart Module");
                            System.out.println("======================");
                            System.out.println("A - Add Item");
                            System.out.println("R - Remove Item");
                            System.out.println("M - Return to Main Menu");
                            System.out.println("======================");
                            System.out.print("Enter your Shopping Cart type code (A, R, M) : ");
                            
                            module = scanner.nextLine().toUpperCase();
                            if (module.equals("M")) break;

                            if (module.equals("A")) {
                                System.out.println("Adding item to the cart...");
                                // Placeholder for adding items logic
                            } else if (module.equals("R")) {
                                System.out.println("Removing item from the cart...");
                                // Placeholder for removing items logic
                            } else {
                                System.out.println("Invalid Shopping Cart type code.");
                            }
                        }
                        break;

                    case C:
                        while (true) {
                            System.out.println(" Checkout Module");
                            System.out.println("======================");
                            System.out.println("T - Total Amount");
                            System.out.println("P - Process Payment");
                            System.out.println("M - Return to Main Menu");
                            System.out.println("======================");
                            System.out.print("Enter your Checkout type code (T, P, M) : ");
                            
                            module = scanner.nextLine().toUpperCase();
                            if (module.equals("M")) break;

                            if (module.equals("T")) {
                                System.out.println("Total cost: $" + totalCost);
                            } else if (module.equals("P")) {
                                amountToBePaid = totalCost;
                                // Simulate payment processing
                                boolean paymentSuccess = random.nextBoolean(); // Randomly simulate payment success
                                if (paymentSuccess) {
                                    System.out.println("Payment Successful! Amount Paid: $" + amountToBePaid);
                                    // Optionally reset totalCost and productCost after successful payment
                                    totalCost = 0;
                                    productCost = 0;
                                } else {
                                    System.out.println("Payment Failed. Please try again.");
                                }
                            } else {
                                System.out.println("Invalid Checkout type code.");
                            }
                        }
                        break;

                    case Q:
                        System.out.println("Quit Module");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid Module code.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Module code.");
            }
        }
    }
}
