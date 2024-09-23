package com.evergent.CoreJAVA.finalProject;

import java.util.List;
import java.util.Scanner;

public class AutomobileServiceApplication {
    private AutomobileServiceService automobileServiceService = new AutomobileServiceService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    handleCreateInquiry();
                    break;
                case 2:
                    handleViewInquiries();
                    break;
                case 3:
                    handleAddResponse();
                    break;
                case 4:
                    handleViewResponses();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("1. Create Inquiry");
        System.out.println("2. View Inquiries");
        System.out.println("3. Add Response");
        System.out.println("4. View Responses");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleCreateInquiry() {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter vehicle model: ");
        String vehicleModel = scanner.nextLine();
        System.out.print("Enter inquiry details: ");
        String details = scanner.nextLine();
       
        Inquiry newInquiry = new Inquiry(customerName, vehicleModel, details);
        int result = automobileServiceService.createInquiry(newInquiry);
        if (result > 0) {
            System.out.println("Inquiry created successfully.");
        } else {
            System.out.println("Failed to create inquiry.");
        }
    }

    private void handleViewInquiries() {
        List<Inquiry> inquiries = automobileServiceService.getInquiries();
        if (inquiries.isEmpty()) {
            System.out.println("No inquiries found.");
        } else {
            System.out.println("Inquiries:");
            for (Inquiry inquiry : inquiries) {
                System.out.println(inquiry);
            }
        }
    }

    private void handleAddResponse() {
        System.out.print("Enter inquiry ID: ");
        int inquiryId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter response: ");
        String response = scanner.nextLine();
       
        int result = automobileServiceService.addResponse(inquiryId, response);
        if (result > 0) {
            System.out.println("Response added successfully.");
        } else {
            System.out.println("Failed to add response.");
        }
    }

    private void handleViewResponses() {
        System.out.print("Enter inquiry ID: ");
        int inquiryId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        List<String> responses = automobileServiceService.getResponses(inquiryId);
        if (responses.isEmpty()) {
            System.out.println("No responses found.");
        } else {
            System.out.println("Responses:");
            for (String response : responses) {
                System.out.println(response);
            }
        }
    }

    public static void main(String[] args) {
        AutomobileServiceApplication app = new AutomobileServiceApplication();
        app.start();
    }
}


