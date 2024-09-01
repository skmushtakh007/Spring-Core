package com.xmlbasedautowiring.main1;
import com.xmlbasedautowiring.pojo.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_file = "/com/xmlbasedautowiring/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
        Students std  = (Students) context.getBean("stdId");
        System.out.println(std);
    }
}
