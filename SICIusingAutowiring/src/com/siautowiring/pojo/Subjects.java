package com.siautowiring.pojo;

import java.util.List;
import java.util.Set;

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
