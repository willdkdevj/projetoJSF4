package br.com.supernova.model;

public class Telefone {
	private String ddd;
	private String numero;
	private Tipo tipo;

	public enum Tipo {
		FIXO, CELULAR;
	}

	public String getDDD(){
		return ddd;
	}

	public void setDDD(String ddd){
		this.ddd = ddd;
	}

	public String getNumero(){
		return numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	public String getTipo(){
		return tipo.name();
	}

	public void setTipo(Tipo tipo){
		this.tipo = tipo;
	}
}
