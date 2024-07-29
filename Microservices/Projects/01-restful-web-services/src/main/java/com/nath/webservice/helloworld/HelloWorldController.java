package com.nath.webservice.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello Rest";
	}
	
	@GetMapping("/hello-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Rest");
	}
	
	@GetMapping("/hello/p-v/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
	
	@GetMapping("/hello-Internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "default message", locale);
	
	}

}
