package br.com.supernova.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("beaninverter")
@RequestScoped
public class BeanInverter implements Serializable {

		private String texto;
		
		public String getTexto() {
			return texto;
		}
		
		public void setTexto(String txt) {
			this.texto = txt;
		}
		
		public String processar() {
			StringBuilder sb = new StringBuilder(getTexto());
			String textoInv = sb.reverse().toString();
			
			setTexto(textoInv);
			
			return null;
		}
	
}
