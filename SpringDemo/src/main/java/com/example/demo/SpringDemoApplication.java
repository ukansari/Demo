package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("added code by TL");
		System.out.println("added code by DEV");
		System.out.println("Added by TL on "+new Date());
		System.out.println("getting exception>>>");
		}

}
