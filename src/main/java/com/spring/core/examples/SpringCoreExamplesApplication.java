package com.spring.core.examples;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreExamplesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.close();
	}

}
