package br.com.supernova.bean;

import java.io.Serializable;
import java.util.List;

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

	public Pessoa getPessoa(){
		
		if(pessoa == null){
			pessoa = new Pessoa();
			pessoa.setEnderecoResidencia(new Endereco());
			pessoa.getEnderecoResidencia().setEstados(new Estado());
			pessoa.setTelefoneResidencia(new Telefone());
			pessoa.setTelefoneCelular(new Telefone());
			pessoa.setEnderecoComercial(new Endereco());
			pessoa.getEnderecoComercial().setEstados(new Estado());
			pessoa.setTelefoneComercial(new Telefone());
		}

		return pessoa;
	}

	public void setPessoa(Pessoa pessoa){
		this.pessoa = pessoa;
	}

	public List<Estado> getListaEstados(){
		return DadosFixos.ESTADOS;
	}

	public List<Interesse> getListaInteresses(){
		return DadosFixos.INTERESSES;
	}
}
