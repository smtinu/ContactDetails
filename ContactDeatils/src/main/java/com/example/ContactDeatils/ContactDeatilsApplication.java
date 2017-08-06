package com.example.ContactDeatils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContactDeatilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactDeatilsApplication.class, args);
		System.out.println("Inside ContactDeatilsApplication class");
	}
}
