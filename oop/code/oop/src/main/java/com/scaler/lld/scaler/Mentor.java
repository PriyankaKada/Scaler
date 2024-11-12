package com.scaler.lld.scaler;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

// Step 1 - Extend parent class
@Getter
@Setter
public class Mentor extends User implements Communicate {
    private List<Student> mentees = new ArrayList<>();
    private String company;

    public Mentor(String name, String email, List<Student> mentees, String company) {
        super(name, email);
        this.mentees = mentees;
        this.company = company;
    }
    public Mentor(String name,String email,String company){
        super(name,email);
        this.mentees= new ArrayList<>();
        this.company=company;
    }

    @Override
    public void sendSms() {
        System.out.println("Send SMS to Mentors...");
    }

    @Override
    public void sendEmail() {
        System.out.println("Send Emails to Mentors...");
    }
}
