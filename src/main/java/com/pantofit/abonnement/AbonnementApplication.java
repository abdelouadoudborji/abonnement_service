package com.pantofit.abonnement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
@EnableFeignClients
@SpringBootApplication
public class AbonnementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbonnementApplication.class, args);
	}

}
