package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MediaAdaptationService {
	
	private final List<MediaAdaptation> noticias_adaptacoes = new ArrayList<>();
	
	public void salvar_adaptacao (MediaAdaptation nova_noticia) {
		noticias_adaptacoes.add(nova_noticia);
	}
	
	public List<MediaAdaptation> listar_noticias(){
	    return noticias_adaptacoes;
	}
	

}
