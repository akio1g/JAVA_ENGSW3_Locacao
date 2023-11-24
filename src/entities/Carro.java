package entities;

import java.time.Year;

public class Carro {

	private Year ano;
	private String marca;
	private String modelo;
	
	public Carro(Year ano, String marca, String modelo) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Year getAno() {
		return ano;
	}
	public void setAno(Year ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
