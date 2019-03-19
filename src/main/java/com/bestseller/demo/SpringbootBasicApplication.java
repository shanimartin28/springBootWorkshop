package com.bestseller.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody
@RestController

@SpringBootApplication
public class SpringbootBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicApplication.class, args);
	}

	/**
	 * @RequestMapping
	 * In Spring MVC applications, the RequestDispatcher (Front Controller Below) servlet is responsible for
	 * routing incoming HTTP requests to handler methods of controllers
	 * When configuring Spring MVC, you need to specify the mappings between the requests and handler methods.
	 * To configure the mapping of web requests, you use the @RequestMapping annotation.	 *
	 * The @RequestMapping annotation can be applied to class-level and/or method-level in a controller.
	 * With the preceding code, requests to /get will be handled by basicName()
	 * while request to /info will be handled by basicInfo().
	 * */

	// @RequestMapping annotation is used for mapping web requests onto specific handler classes
	@RequestMapping("/")
	String basicURL() {
		return "Hello from basicURL - TTT ";
	}

	@RequestMapping("/get")
	String basicName() {
		return "Hello from basicName - CATHY";
	}

	@RequestMapping("/info")
	String basicInfo() {
		return "Hello from basicInfo - ABC";
	}

	/**
	 * @RequestMapping With Multiple URIs
	 * You can have multiple request mappings for a method. For that add one @RequestMapping annotation with a list of values.
	 * */

	@RequestMapping(value = {
			"",
			"/page",
			"page*",
			"view/*,**/msg"
	})
	String indexMultipleMapping() {
		return "Hello from index multiple mapping.";
	}

}

