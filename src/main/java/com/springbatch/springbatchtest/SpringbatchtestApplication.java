package com.springbatch.springbatchtest;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringbatchtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchtestApplication.class, args);
	}

}
