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
	
	public List<MediaAdaptation> listar_noticias(int livro_id){
		List<MediaAdaptation> resultado_filtrado = new ArrayList<>();
	    for (MediaAdaptation adaptacao : noticias_adaptacoes) {
	        if (adaptacao.getLivro_id() == livro_id) {
	            resultado_filtrado.add(adaptacao);
	        }
	    }
	    return resultado_filtrado;
	}
	

}
