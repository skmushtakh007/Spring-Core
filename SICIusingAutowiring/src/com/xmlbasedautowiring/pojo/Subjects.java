package com.xmlbasedautowiring.pojo;

import java.util.List;

public class Subjects {
   private List<String> subjects;

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects=" + subjects +
                '}';
    }
}
