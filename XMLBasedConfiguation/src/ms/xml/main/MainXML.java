package ms.xml.main;

import ms.xml.bean.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        String config_file = "/ms/xml/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
        Students std = (Students) context.getBean("stdId");
        System.out.println(std);

    }
}
