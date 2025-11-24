package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contador")
public class SearchCounterController {
	
	@Autowired
	private SearchCounterService service;
	
	@GetMapping
	public int getContador() {
		return service.getContador();
	}
	
}
