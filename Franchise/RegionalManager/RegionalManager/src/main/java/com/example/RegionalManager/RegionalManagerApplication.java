package com.example.RegionalManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RegionalManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegionalManagerApplication.class, args);
	}

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

}
