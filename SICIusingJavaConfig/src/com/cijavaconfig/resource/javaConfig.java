package com.cijavaconfig.resource;

import com.cijavaconfig.pojo.Address;
import com.cijavaconfig.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
    @Bean
    public Address addObject(){
        Address address = new Address("123 srinivas","Mumbai",41234);
        return address;
    }
    @Bean
    public Student stdObject(){
        Student std = new Student("Ajay",22,"srtmu",addObject());
        return std;
    }
}
