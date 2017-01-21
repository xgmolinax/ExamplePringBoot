package com.example;

import com.example.repository.PostRepository;
import com.example.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExampleSpringBootApplication {


	private static final Logger logger = LoggerFactory.getLogger(ExampleSpringBootApplication.class);

	//PostRepository
	@Autowired
	PostRepository postRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExampleSpringBootApplication.class, args);

	}

	//postConstruct
	@PostConstruct
	void seePosts(){

	}
}
