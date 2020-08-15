package com.intconvert.BinaryConversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.conversion"})
public class BinaryConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinaryConversionApplication.class, args);
		System.out.println("welcome to conversion of integer into binary");
	}

}
