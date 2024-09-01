package com.sixml.pojo;

public class Student {
    private String name;
    private int roll_no;
    private String cllg_no;
    private Address address;


    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public void setCllg_no(String cllg_no) {
        this.cllg_no = cllg_no;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", cllg_no='" + cllg_no + '\'' +
                ", address=" + address +
                '}';
    }
}
