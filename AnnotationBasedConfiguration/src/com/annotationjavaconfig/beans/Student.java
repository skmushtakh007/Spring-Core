package com.annotationjavaconfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("917556787")
    private Long mob_no;
    @Value("100000")
    private double fees;
    @Value("Dharam Raj Chowk")
    private String address;

    public Long getMob_no() {
        return mob_no;
    }

    public void setMob_no(Long mob_no) {
        this.mob_no = mob_no;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mob_no=" + mob_no +
                ", fees=" + fees +
                ", address='" + address + '\'' +
                '}';
    }
}
