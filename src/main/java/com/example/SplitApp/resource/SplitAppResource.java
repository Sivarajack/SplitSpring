package com.example.SplitApp.resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplitAppResource {
	@RequestMapping("/greeting")
	public String sayHello() {
		return "Sivaraj";
	}

}
