package com.javaconfig.main;

import com.javaconfig.pojo.Student;
import com.javaconfig.javaConfig.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std  = (Student)context.getBean("stdId");
        System.out.println(std);
//        OR
//        Student std = context.getBean(Student.class);
//        System.out.println(std);

        Student std1 = (Student) context.getBean("objName");
        System.out.println(std1);

    }
}
