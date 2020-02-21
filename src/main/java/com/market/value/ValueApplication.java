package com.market.value;

import com.iol.services.IolProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.controllers","com.iol.services","interfaces"})
@EnableConfigurationProperties(IolProperties.class)
public class ValueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValueApplication.class, args);
	}

}
