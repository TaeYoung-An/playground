package com.mimi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@org.springframework.stereotype.Controller
@RequestMapping()
@Log4j
public class Controller {

	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
