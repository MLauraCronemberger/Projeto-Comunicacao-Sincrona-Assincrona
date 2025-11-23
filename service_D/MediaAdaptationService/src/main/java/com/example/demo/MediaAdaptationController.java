package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adaptacoes")
public class MediaAdaptationController {
	
	@Autowired
	private MediaAdaptationService service;
	
	@GetMapping("/{livro_id}")
	public List<MediaAdaptation> listar_noticias(@PathVariable int livro_id){
		return service.listar_noticias(livro_id);
	}

}
