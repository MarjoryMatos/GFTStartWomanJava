package com.digitalinnovation.labpadroesdeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class LabpadroesdeprojetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabpadroesdeprojetoApplication.class, args);
	}

}
