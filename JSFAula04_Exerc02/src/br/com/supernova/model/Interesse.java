package br.com.supernova.model;

public class Interesse {
	private Integer id;
	private String area;

	public Interesse(){
		
	}

	public Interesse(Integer id, String area){
		this.id = id;
		this.area = area;
	}

	public Integer getID(){
		return id;
	}

	public void setID(Integer id){
		this.id = id;
	}

	public String getArea(){
		return area;
	}

	public void setArea(String area){
		this.area = area;
	}
}
