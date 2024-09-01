package com.annotationjavaconfig.mains;

import com.annotationjavaconfig.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainjava {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
         Student std=(Student)context.getBean("student");
        System.out.println(std);
    }
}
