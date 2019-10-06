package com.ganga.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public interface DemoController {

	//@GetMapping(path = "/test")
	public String hello();
}
