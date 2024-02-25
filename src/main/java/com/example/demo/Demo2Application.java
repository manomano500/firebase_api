package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Demo2Application { 

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("<<<<<<<<<<<<this program is running  succesfully now >>>>>>>>>>>>>>");
	}

}
