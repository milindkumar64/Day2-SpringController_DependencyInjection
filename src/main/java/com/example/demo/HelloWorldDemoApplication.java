package com.example.demo;

//import com.example.demo.component.DemoBean;
import com.example.demo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {

		System.out.println("Hello Milind");
		ApplicationContext context= SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
