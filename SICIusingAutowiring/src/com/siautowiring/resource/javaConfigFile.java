package com.siautowiring.resource;

import com.siautowiring.pojo.Address;
import com.siautowiring.pojo.Student;
import com.siautowiring.pojo.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class javaConfigFile {
    @Bean
    public Address addObj(){
        Address address = new Address();
        address.setHouse_no("123 house");
        address.setCity("Pune");
        address.setPincode(23145);
        return address;
    }
    @Bean
    public Address addObj1(){
        Address address = new Address();
        address.setHouse_no("123 house");
        address.setCity("Nashik");
        address.setPincode(9045);
        return address;
    }
    @Bean
    public Subjects subObj(){
        Subjects sub = new Subjects();
        List<String> sub_list = new ArrayList<>();
        sub_list.add("java");
        sub_list.add("python");
        sub_list.add("c++");
        sub.setSubjects(sub_list);
        return sub;
    }
    @Bean
    public Student stdObj(){
        Student std = new Student();
        std.setName("John");
        std.setRoll_no(12);
        std.setCollg_name("srtmu");
//        std.setAddress(addObj());     manually injecting
        return std;
    }
}
