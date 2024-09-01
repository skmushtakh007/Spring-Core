package com.sijavaconfig.main1;

import com.cijavaconfig.pojo.Student;
import com.cijavaconfig.resource.javaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student std = context.getBean(Student.class);
        System.out.println(std);
    }
}
