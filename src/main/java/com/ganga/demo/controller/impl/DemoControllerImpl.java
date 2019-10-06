package com.ganga.demo.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerImpl {

	@GetMapping(path = "/jyesh")
	public String hello1() {
		return "<html><body bgcolor='yellow'><marquee><b>hi my name is jyesh</b></marquee></body></html>";
	}

	@GetMapping(path = "/tanviha")
	public String hello2() {
		return "Welcome Tanviha";
	}

	
}
