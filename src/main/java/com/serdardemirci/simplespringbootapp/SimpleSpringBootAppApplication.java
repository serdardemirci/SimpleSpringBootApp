package com.serdardemirci.simplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication // (exclude = {SecurityAutoConfiguration.class})
public class SimpleSpringBootAppApplication {


    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootAppApplication.class, args);
    }

}
