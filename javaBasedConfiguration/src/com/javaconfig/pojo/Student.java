package com.javaconfig.pojo;

public class Student {
    private String name;
    private int roll_no;
    private String clg_no;

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

    public String getClg_no() {
        return clg_no;
    }

    public void setClg_no(String clg_no) {
        this.clg_no = clg_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", clg_no='" + clg_no + '\'' +
                '}';
    }
}
