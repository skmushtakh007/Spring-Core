package com.cijavaconfig.pojo;

public class Student {
    private String name;
    private int roll_no;
    private String cllg_name;
    private Address address;

    public Student(String name, int roll_no, String cllg_name, Address address) {
        this.name = name;
        this.roll_no = roll_no;
        this.cllg_name = cllg_name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", cllg_name='" + cllg_name + '\'' +
                ", address=" + address +
                '}';
    }
}
