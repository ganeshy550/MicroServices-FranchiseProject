package com.example.FranchiseOwner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class FranchiseOwnerApplication {

	public static void main(String[] args) {

		SpringApplication.run(FranchiseOwnerApplication.class, args);
	}
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}


}

