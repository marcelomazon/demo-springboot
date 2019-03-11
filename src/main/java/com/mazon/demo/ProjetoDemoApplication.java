package com.mazon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mazon"})
public class ProjetoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDemoApplication.class, args);
		System.out.println("Hola");
	}

}
