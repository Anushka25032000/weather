package com.anushka.assignment.weatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableCaching
public class WeatherPredictionApp {

	public static void main(String[] args) {
		SpringApplication.run(WeatherPredictionApp.class, args);
	}

}
