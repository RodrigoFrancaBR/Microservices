package br.com.alura.microservice.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LojaApplication {	

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

}
