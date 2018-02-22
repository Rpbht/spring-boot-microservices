package com.cignex.springaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAccountsApplication.class, args);
	}
}
