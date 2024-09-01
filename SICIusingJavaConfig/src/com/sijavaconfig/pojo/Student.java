package com.sijavaconfig.pojo;

public class Student {
    private String name;
    private int roll_no;
    private String cllg_name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setCllg_name(String cllg_name) {
        this.cllg_name = cllg_name;
    }

    public void setAddress(Address address) {
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
