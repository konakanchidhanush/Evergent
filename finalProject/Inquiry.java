package com.evergent.CoreJAVA.finalProject;

public class Inquiry {
    private String customerName;
    private String vehicleModel;
    private String details;

    public Inquiry(String customerName, String vehicleModel, String details) {
        this.customerName = customerName;
        this.vehicleModel = vehicleModel;
        this.details = details;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Vehicle Model: " + vehicleModel + ", Details: " + details;
    }
}

