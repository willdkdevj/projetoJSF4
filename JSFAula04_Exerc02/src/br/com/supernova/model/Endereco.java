package br.com.supernova.model;

public class Endereco {
	private String rua;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private Estado estados;

	public String getRua(){
		return rua;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

	public Integer getNumero(){
		return numero;
	}

	public void setNumero(Integer num){
		this.numero = num;
	}

	public String getComplemento(){
		return complemento;
	}

	public void setComplemento(String comp){
		this.complemento = comp;
	}

	public String getBairro(){
		return bairro;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getCEP(){
		return cep;
	}

	public void setCEP(String cep){
		this.cep = cep;
	}

	public String getCidade(){
		return cidade;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public Estado getEstados(){
		return estados;
	}

	public void setEstados(Estado estado){
		this.estados = estado;
	}
}
