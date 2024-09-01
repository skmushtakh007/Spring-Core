package com.sijavaconfig.resource;

import com.sijavaconfig.pojo.Address;
import com.sijavaconfig.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class javaConfigFile {
    @Bean
    public Address addObj(){
        Address address = new Address();
        address.setHouse_no("123 niwas");
        address.setCity("Mumbai");
        address.setPincode_no(23453);
        return address;
    }
    @Bean
    public Student stdObj(){
        Student std = new Student();
        std.setName("Saleem");
        std.setRoll_no(123);
        std.setCllg_name("srtmu");
        std.setAddress(addObj());
        return std;
    }
}
