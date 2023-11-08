package com.springboot.ToDo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(Application.class,args);
	}
	@Override
	public void run(String... args) throws Exception {
//		System.out.println(bookRepository.findAll());
	}
}
