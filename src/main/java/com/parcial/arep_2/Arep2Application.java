package com.parcial.arep_2;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Arep2Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Arep2Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
	}

}
