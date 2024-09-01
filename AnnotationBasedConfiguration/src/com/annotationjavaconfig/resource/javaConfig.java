package com.annotationjavaconfig.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.annotationjavaconfig.beans")
// @ComponentScan({"com.annotaionjavaconfig.beans", "----","------"})
// @ComponentScan(basePackages = {"com.annotationjavaconfig.beans"})
public class javaConfig {
}
