package com.sharath.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestServiceApplication.class, args);
	}

}

@RestController
class HelloService {
	
	@GetMapping(path = "/")
	public String sayHello() {
		return "HELLO Friend";
	}
}