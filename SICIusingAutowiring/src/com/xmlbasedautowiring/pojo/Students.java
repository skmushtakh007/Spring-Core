package com.xmlbasedautowiring.pojo;

public class Students {
    private String name;
    private String cllg_name;
    private int roll_no;
    private Subjects subjects;
    private Address address;    // property name

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCllg_name(String cllg_name) {
        this.cllg_name = cllg_name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cllg_name='" + cllg_name + '\'' +
                ", roll_no=" + roll_no +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }
}
