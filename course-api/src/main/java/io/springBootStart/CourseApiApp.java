package io.springBootStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	//this class is contain servlet and start and host the application
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
		System.out.println("test");

	}

}
