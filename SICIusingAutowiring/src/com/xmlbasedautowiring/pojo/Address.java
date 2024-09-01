package com.xmlbasedautowiring.pojo;

public class Address {
    private String house_no;
    private String city;
    private String state;

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house_no='" + house_no + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
