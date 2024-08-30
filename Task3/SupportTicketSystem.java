package com.evergent.CoreJAVA.Dhanush.Task3;

import java.util.ArrayDeque;

public class SupportTicketSystem {
    private ArrayDeque<String> ticketQueue = new ArrayDeque<>();

    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        
        // Adding tickets
        system.addTicket("Ticket 1: Issue with login");
        system.addTicket("Ticket 2: Error on payment page");
        system.addTicket("Ticket 3: Account recovery request");

        // Display the current state of the queue
        system.displayQueue();

        // Processing tickets
        system.processNextTicket();
        system.processNextTicket();

        // Peek at the next ticket
        system.peekNextTicket();

        // Display the current state of the queue
        system.displayQueue();

        // Process remaining tickets
        system.processNextTicket();
        system.processNextTicket(); // No tickets to process
    }

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added ticket: " + ticket);
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
