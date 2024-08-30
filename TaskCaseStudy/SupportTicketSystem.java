package com.evergent.CoreJAVA.Dhanush.TaskCaseStudy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Scanner;

public class SupportTicketSystem {
    private ArrayDeque<String> ticketQueue = new ArrayDeque<>();

    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Peek Next Ticket");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the ticket description: ");
                    String ticket = sc.nextLine();
                    system.addTicket(ticket);
                    System.out.println("The ticket has been added successfully.");
                    break;
                
                case 2:
                    system.processNextTicket();
                    break;
                
                case 3:
                    system.peekNextTicket();
                    break;
                
                case 4:
                    system.displayQueue();
                    break;
                
                case 5:
                    System.out.println("Exiting the system.");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
    }

    // Method to process the next ticket in the queue
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket != null) {
            System.out.println("Next ticket: " + ticket);
        } else {
            System.out.println("No tickets in the queue.");
        }
    }

    // Method to display all tickets in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Current tickets in the queue: " + ticketQueue);
        }
    }
}
