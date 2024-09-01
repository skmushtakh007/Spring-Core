package com.sixml.main;

import com.sixml.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSI {
    public static void main(String[] args) {
        String config_file = "/com/sixml/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
        Student std = (Student) context.getBean("stdId");
        System.out.println(std);
    }
}
