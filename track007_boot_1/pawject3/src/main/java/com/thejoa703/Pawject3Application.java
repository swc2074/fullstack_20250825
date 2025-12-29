package com.thejoa703;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Pawject3Application { 
	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1.2,TLSv1.3");
		SpringApplication.run(Pawject3Application.class, args);
	}

}

 