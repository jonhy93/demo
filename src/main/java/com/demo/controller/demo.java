package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class demo {

	@GetMapping("/demo/portada")
	public String Index()
	{
		return "portada";
	}
	
}
