package br.com.curso.herança;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculos {
	
    static List<Veiculos> list = new ArrayList<>();
	
	private String categoria;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	
	
	public Veiculos() {
		
	}
	

	public abstract void dadosVeiculos();
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	

}
