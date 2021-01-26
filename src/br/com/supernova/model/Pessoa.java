package br.com.supernova.model;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String email;
	private Date dataNascimento;
	private Endereco enderecoResidencia;
	private Telefone telefoneResidencia;
	private Telefone telefoneCelular;
	
	private String nomeEmpresa;
	private Endereco enderecoComercial;
	private Telefone telefoneComercial;
	private String cargo;
	private Double salario;
	
	private Interesse[] interesses;

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public Date getDataNascimento(){
		return dataNascimento;
	}

	public void setDataNascimento(Date data){
		this.dataNascimento = data;
	}

	public Endereco getEnderecoResidencia(){
		if(enderecoResidencia==null) {
			enderecoResidencia = new Endereco();
			System.out.println("Retornado Endereço");
		}
		
		return enderecoResidencia;
	}

	public void setEnderecoResidencia(Endereco endereco){
		System.out.println("Instanciado Endereco");
		this.enderecoResidencia = endereco;
	}

	public Telefone getTelefoneResidencia(){
		if(telefoneResidencia==null) {
			telefoneResidencia = new Telefone();
		}
		return telefoneResidencia;
	}

	public void setTelefoneResidencia(Telefone telefone){
		this.telefoneResidencia = telefone;
	}

	public Telefone getTelefoneCelular(){
		return telefoneCelular;
	}

	public void setTelefoneCelular(Telefone telefone){
		this.telefoneCelular = telefone;
	}

	public void setNomeEmpresa(String empresa){
		this.nomeEmpresa = empresa;
	}

	public String getNomeEmpresa(){
		return nomeEmpresa;
	}

	public void setEnderecoComercial(Endereco endereco){
		this.enderecoComercial = endereco;
	}

	public Endereco getEnderecoComercial(){
		return enderecoComercial;
	}
	
	public Telefone getTelefoneComercial(){
		return telefoneComercial;
	}

	public void setTelefoneComercial(Telefone telefone){
		this.telefoneComercial = telefone;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}

	public String getCargo(){
		return cargo;
	}

	public void setSalario(Double salario){
		this.salario = salario;
	}

	public Double getSalario(){
		return salario;
	}

	public void setInteresses(Interesse[] interesse){
		this.interesses = interesse;
	}

	public Interesse[] getInteresses(){
		return interesses;
	}
}
