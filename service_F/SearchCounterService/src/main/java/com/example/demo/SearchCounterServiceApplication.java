package com.example.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SearchCounterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchCounterServiceApplication.class, args);
	}

}
