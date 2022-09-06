package br.com.curso.herança;


public class Carro extends Veiculos {
	
	private String tipo;
	
	
	public Carro() {
		
	}
	
	public void ListaCarro(String placa,String marca,String modelo,int ano,String tipo) {
		 super.setCategoria("Carro");
		 super.setPlaca(placa);
		 super.setMarca(marca);
		 super.setModelo(modelo);
		 super.setAno(ano);
		 this.setTipo(tipo);		
		
	}
	
	public boolean AddCarro(Carro carro) {
	     return list.add(carro);
	}

	@Override
	public void dadosVeiculos() {
		
		System.out.println("------------------CARRO-------------------");
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Placa: "+getPlaca());
		System.out.println("Ano: "+getAno());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
		System.out.println("-----------------------------------------");
		
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

}
