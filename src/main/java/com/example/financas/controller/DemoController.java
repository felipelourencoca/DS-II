package com.example.financas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


	@GetMapping("/foo")
	public String foo() {
		return "Foo";
	}
	
}
