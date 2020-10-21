package br.com.supernova.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.supernova.business.DadosFixos;
import br.com.supernova.model.Endereco;
import br.com.supernova.model.Estado;
import br.com.supernova.model.Interesse;
import br.com.supernova.model.Pessoa;
import br.com.supernova.model.Telefone;

@Named("cadastro")
@SessionScoped
public class CadastroBean implements Serializable {
	
	private Pessoa pessoa;

	@PostConstruct
	public void init() {
			
		System.out.println("Instanciando Cadastro!");
		
	}
	
	public Pessoa getPessoa(){		
		if(pessoa == null) {
			pessoa = new Pessoa();			
			pessoa.setEnderecoResidencia(new Endereco());			
			pessoa.getEnderecoResidencia().setEstado(new Estado());
			pessoa.setEnderecoComercial(new Endereco());
			pessoa.getEnderecoComercial().setEstado(new Estado());
			pessoa.setTelefoneResidencia(new Telefone());
			pessoa.setTelefoneCelular(new Telefone());			
			pessoa.setTelefoneComercial(new Telefone());			
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa){
		this.pessoa = pessoa;
	}

	public List<Estado> getEstados(){
		System.out.println("Lista de Estados retornada");
		return DadosFixos.ESTADOS;
	}

	public List<Interesse> getInteresses(){
		System.out.println("Lista de Estados setada");
		return DadosFixos.INTERESSES;
	}
}
