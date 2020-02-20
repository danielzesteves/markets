package com.market.value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.controllers","com.iol.services","interfaces"})
public class ValueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValueApplication.class, args);
	}

}
