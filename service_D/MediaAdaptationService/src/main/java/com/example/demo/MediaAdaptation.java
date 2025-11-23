package com.example.demo;

public class MediaAdaptation {
	private int livro_id;
	private String tipo_adaptacao;
	private String descricao;
	
	
	public int getLivro_id() {
		return livro_id;
	}
	public void setLivro_id(int livro_id) {
		this.livro_id = livro_id;
	}
	public String getTipo_adaptacao() {
		return tipo_adaptacao;
	}
	public void setTipo_adaptacao(String tipo_adaptacao) {
		this.tipo_adaptacao = tipo_adaptacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public MediaAdaptation(int livro_id, String tipo_adaptacao, String descricao) {
		super();
		this.livro_id = livro_id;
		this.tipo_adaptacao = tipo_adaptacao;
		this.descricao = descricao;
	}
	
	
	

}
