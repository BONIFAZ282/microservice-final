package com.universidad2.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UniversidadService2Application {

	public static void main(String[] args) {
		SpringApplication.run(UniversidadService2Application.class, args);
	}

}
