package com.akhi.spring;


import com.akhi.spring.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class MyApp {

    @Autowired
    MyService myService;
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MyApp.class, args);


    }

/*
    @Bean
    public CommandLineRunner testRety(){
        return (args)->{
            myService.mayFailedCall();
        };

    }*/


}
