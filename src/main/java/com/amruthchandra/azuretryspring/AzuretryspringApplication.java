package com.amruthchandra.azuretryspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = {"com.amruthchandra.azuretryspring"})
public class AzuretryspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuretryspringApplication.class, args);
	}

}
