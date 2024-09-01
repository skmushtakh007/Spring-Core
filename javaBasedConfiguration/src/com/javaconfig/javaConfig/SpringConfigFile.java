package com.javaconfig.javaConfig;

import com.javaconfig.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId(){    // which will return student reference
        Student std = new Student();
        std.setName("Mustakh");
        std.setRoll_no(100);
        std.setClg_no("MuMu");
        return std;
    }

    @Bean("objName")
    public Student createBeanObject(){
        Student std1 = new Student();
        std1.setName("Shaikh");
        std1.setRoll_no(199);
        std1.setClg_no("DYP");
        return std1;
    }

}
