package com.siautowiring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int roll_no;
    private String collg_name;
    @Autowired
    @Qualifier("addObj1")
    private Address address;
    @Autowired
    private Subjects subjects;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setCollg_name(String collg_name) {
        this.collg_name = collg_name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", collg_name='" + collg_name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
