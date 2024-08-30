package com.evergent.CoreJAVA.Dhanush.Application4;

public class Tegver extends ConstructorMessage {
   

	Tegver(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConstructorMessage m = new ConstructorMessage("Welxome to Tegver!!");
		m.display();

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

            String moduleCode = AbstractModule.scanner.nextLine().toUpperCase();

            Module module = null;
            switch (moduleCode) {
                case "P":
                    module = new ProductsModule();
                    break;
                case "O":
                    module = new OrdersModule();
                    break;
                case "S":
                    module = new ShoppingCartModule();
                    break;
                case "C":
                    module = new CheckoutModule();
                    break;
                case "Q":
                	QuitModule m1= new QuitModule();
                	m1.quit();
                	System.exit(0);
                    
                default:
                    System.out.println("Invalid Module code.");
            }
            if (module != null) {
                module.execute();
            }
        }
    }
}
