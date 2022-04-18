package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class BidFitApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidFitApplication.class, args);
	}

}
