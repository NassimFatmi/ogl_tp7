package com.telly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class HomeController {
	
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}	
}
