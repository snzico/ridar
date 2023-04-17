package com.example.ridar;

import java.util.List;

public class Submission {
    String submissionCustomerName;
    String submissionCustomerAddress;
    int submissionCustomerRating;
    String submissionCustomerAttributes;

    public Submission () {
    }

    public Submission (String submissionCustomerName) {
        this.submissionCustomerName = submissionCustomerName;
    }

    public Submission (String submissionCustomerName, String submissionCustomerAddress) {
        this.submissionCustomerName = submissionCustomerName;
        this.submissionCustomerAddress = submissionCustomerAddress;
    }

    public Submission (String submissionCustomerName, String submissionCustomerAddress, int submissionCustomerRating, String submissionCustomerAttributes) {
        this.submissionCustomerName = submissionCustomerName;
        this.submissionCustomerAddress = submissionCustomerAddress;
        this.submissionCustomerRating = submissionCustomerRating;
        this.submissionCustomerAttributes = submissionCustomerAttributes;
    }

    public String getSubmissionCustomerName() {
        return submissionCustomerName;
    }

    public String getSubmissionCustomerAddress() {
        return submissionCustomerAddress;
    }

    public int getSubmissionCustomerRating() {
        return submissionCustomerRating;
    }

    public String getSubmissionCustomerAttributes() {
        return submissionCustomerAttributes;
    }

    public void setSubmissionCustomerName(String submissionCustomerName) {
        this.submissionCustomerName = submissionCustomerName;
    }

    public void setSubmissionCustomerAddress(String submissionCustomerAddress) {
        this.submissionCustomerAddress = submissionCustomerAddress;
    }

    public void setSubmissionCustomerRating(int submissionCustomerRating) {
        this.submissionCustomerRating = submissionCustomerRating;
    }

    public void setSubmissionCustomerAttributes(String submissionCustomerAttributes) {
        this.submissionCustomerAttributes = submissionCustomerAttributes;
    }
}
