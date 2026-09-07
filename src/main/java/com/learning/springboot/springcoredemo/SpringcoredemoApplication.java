package com.learning.springboot.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// This line enables other packages which are not included in the package where current file resides
// @SpringBootApplication(scanBasePackages = {"com.learning.springboot.utils","com.learning.springboot."})

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}
}
