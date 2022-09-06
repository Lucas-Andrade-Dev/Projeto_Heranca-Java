package br.com.curso.herança;

public class Moto extends Veiculos {

	private int cilindradas;
	
	public Moto() {

	}

	public void listaMoto(String placa, int ano, int cilindradas, String marca, String modelo) {

		super.setCategoria("Moto");
		super.setPlaca(placa);
		super.setMarca(marca);
		super.setModelo(modelo);
		super.setAno(ano);
		this.setCilindradas(cilindradas);
		

	}
	
	public boolean AddMoto(Moto moto) {
		return list.add(moto);
	}

	@Override
	public void dadosVeiculos() {
		System.out.println("------------------MOTO-------------------");
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Placa: "+getPlaca());
		System.out.println("Ano: "+getAno());
		System.out.println("Cilindradas: "+getCilindradas());
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
		System.out.println("-----------------------------------------");

	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
