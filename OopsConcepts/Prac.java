package com.evergent.CoreJAVA.OopsConcepts;

import java.util.Scanner;

public class Prac {
    enum Module {O, P, R, S}
    enum Module1 {F, S, M}
    enum Module2 {T, P, M}
    enum Module3 {I, S, M}
    enum Module4 {A, B}

    static int amount;
    static int client;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a module (O, P, R, S):");
            String s = sc.next().toUpperCase(); // Convert input to uppercase to match enum values
            
            try {
                switch (Module.valueOf(s)) {
                    case O:
                        System.out.println("hello bro");
                        System.out.println("Enter a module1 (F, S, M):");
                        String s1 = sc.next().toUpperCase();
                        switch (Module1.valueOf(s1)) {
                            case F:
                                System.out.println("order are pLACED");
                                System.out.println("Enter a module4 (A, B):");
                                String s2 = sc.next().toUpperCase();
                                switch (Module4.valueOf(s2)) {
                                    case A:
                                    case B:
                                        System.out.println("Welcome to the club kidooo");
                                        System.out.println("enter the number of clients");
                                        client = sc.nextInt();
                                        amount = client * client;
                                        System.out.println("the amount is: " + amount);
                                        break;
                                    default:
                                        System.out.println("Invalid module4");
                                        break;
                                }
                                break;
                            case S:
                            case M:
                                System.out.println("Other Module1 selected");
                                break;
                            default:
                                System.out.println("Invalid module1");
                                break;
                        }
                        System.out.println("Enter the payment options (I, S, M):");
                        String a = sc.next().toUpperCase();
                        switch (Module3.valueOf(a)) {
                            case I:
                                System.out.println("payment cheyyi tammudu");
                                break;
                            case S:
                                System.out.println("kattina bro");
                                break;
                            case M:
                                System.out.println("chel bro");
                                break;
                            default:
                                System.out.println("Invalid payment option");
                                break;
                        }
                        break;
                    case P:
                    case R:
                    case S:
                        System.out.println("Other Module selected");
                        break;
                    default:
                        System.out.println("Invalid module");
                        break;
                }
                System.out.println("Enter another module (T, P, M) to continue or 'exit' to quit:");
                String b = sc.next().toUpperCase();
                if (b.equals("EXIT")) {
                    break;
                }
                switch (Module2.valueOf(b)) {
                    case T:
                        System.out.println("paisal kattinava leda");
                        break;
                    case P:
                    case M:
                        System.out.println("Other Module2 selected");
                        break;
                    default:
                        System.out.println("Invalid module2");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, please enter a valid module.");
            }
        }
        sc.close();
    }
}
