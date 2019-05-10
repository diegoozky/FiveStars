package com.pelicula.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class StarsApplication {
	 private static Logger logger = LoggerFactory.getLogger(StarsApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(StarsApplication.class, args);
		
	         logger.warn("Hello world.!!");
		
	}

}
