package br.com.supernova.model;

public class Estado {
	private String nome;
	private String sigla;

	public Estado(){
		System.out.println("Instanciando estado - construdor vazio");
	}

	public Estado(String nome, String sigla){
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSigla(){
		return sigla;
	}

	public void setSigla(String sigla){
		this.sigla = sigla;
	}
}
