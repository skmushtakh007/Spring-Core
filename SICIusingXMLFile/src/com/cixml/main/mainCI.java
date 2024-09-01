package com.cixml.main;

import com.cixml.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainCI {
    public static void main(String[] args) {
        String config_file = "/com/cixml/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
        Student std = (com.cixml.pojo.Student) context.getBean("stdId");
        System.out.println(std);
    }
}
