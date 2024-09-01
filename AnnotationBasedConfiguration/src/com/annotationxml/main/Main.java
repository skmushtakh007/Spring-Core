package com.annotationxml.main;

import com.annotationxml.pojo.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_file = "/com/annotationxml/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
        Students std  = (Students) context.getBean("students");
        System.out.println(std);

    }
}
