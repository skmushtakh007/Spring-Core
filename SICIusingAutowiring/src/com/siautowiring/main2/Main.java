package com.siautowiring.main2;

import com.siautowiring.pojo.Student;
import com.siautowiring.resource.javaConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigFile.class);
        Student std = context.getBean(Student.class);
        System.out.println(std);
    }
}
