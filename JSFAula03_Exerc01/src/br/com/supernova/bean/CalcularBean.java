package br.com.supernova.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named("calcularbean")
@RequestScoped
public class CalcularBean implements Serializable{

	@Inject
	private Flash flash;
	private Integer valor1, valor2, valor3, resultado;
	
	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer getValor3() {
		return valor3;
	}

	public void setValor3(Integer valor3) {
		this.valor3 = valor3;
	}

	public Integer getResultado() {
		return resultado;
	}
	
	public String calcularSoma() {
		resultado = getValor1() + getValor2() + getValor3();
		
		// Imprimir no  console o resultado do AS
		System.out.println("O Resultado foi: " + resultado);
		
		// Inserido  valorr da operação em variavel temporária para uso do redirect
		flash.put("valorDaOperacao", resultado);
		
		// Retorno do Outcome (result - View=result.xhtml) com incremento do valor de redirect
		return "result?faces-redirect=true";
	}
}
