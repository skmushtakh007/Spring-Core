package com.sijavaconfig.pojo;

public class Address {
    private String house_no;
    private String city;
    private int pincode_no;

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode_no(int pincode_no) {
        this.pincode_no = pincode_no;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house_no='" + house_no + '\'' +
                ", city='" + city + '\'' +
                ", pincode_no=" + pincode_no +
                '}';
    }
}
