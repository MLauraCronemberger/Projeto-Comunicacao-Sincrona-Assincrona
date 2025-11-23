package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adaptacoes")
public class MediaAdaptationController {
	
	@Autowired
	private MediaAdaptationService service;
	
	@GetMapping("/listar")
	public List<MediaAdaptation> listar_noticias(){
		return service.listar_noticias();
	}

}
