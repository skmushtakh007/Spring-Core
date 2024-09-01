package com.annotationxml.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
    @Value("Mustakh")
    private String name;
    @Value("11")
    private int roll_no;
    @Value("DYP")
    private String clg_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getClg_name() {
        return clg_name;
    }

    public void setClg_name(String clg_name) {
        this.clg_name = clg_name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", clg_name='" + clg_name + '\'' +
                '}';
    }
}
