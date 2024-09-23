package com.evergent.CoreJAVA.finalProject;

import java.util.List;

public class AutomobileServiceService {
    private AutomobileServiceDAO automobileServiceDAO = new AutomobileServiceDAO();

    public int createInquiry(Inquiry inquiry) {
        return automobileServiceDAO.createInquiry(inquiry.getCustomerName(), inquiry.getVehicleModel(), inquiry.getDetails());
    }

    public List<Inquiry> getInquiries() {
        return automobileServiceDAO.getInquiries();
    }

    public int addResponse(int inquiryId, String response) {
        return automobileServiceDAO.addResponse(inquiryId, response);
    }

    public List<String> getResponses(int inquiryId) {
        return automobileServiceDAO.getResponses(inquiryId);
    }
}