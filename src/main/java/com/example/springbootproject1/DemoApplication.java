package com.example.springbootproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("HELLO WISCONSIN");
		System.out.println();
		System.out.println("DEPLOY SUCCESSFUL.");
	}

	public static String returnAString(String something) {
		return something;
	}
}
