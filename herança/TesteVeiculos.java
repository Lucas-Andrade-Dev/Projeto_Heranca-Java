package br.com.curso.herança;

import java.util.Scanner;

public class TesteVeiculos {

	private static Scanner ler;

	public static void main(String[] args) {

		ler = new Scanner(System.in);

		String placa, modelo, marca, tipo;
		int ano, cilindradas;
		int cont = 0;
		int cont2 = 0;

		while (cont != 4) {


			System.out.println("(1)Carro (2)Moto (3)Listar Todos (4)Sair");
			cont = ler.nextInt();

			switch (cont) {

			case 1:
				
				cont2=0;
				while (cont2 != 3) {
					
					Carro carro = new Carro();
					
					System.out.println("::::::::::::CARROS:::::::::::::::");
					System.out.println("Cadastrar(1) Listar(2) Voltar(3)");
					System.out.println(":::::::::::::::::::::::::::::::::");
					cont2 = ler.nextInt();
					
					switch (cont2) {

					case 1:

						System.out.println("Placa: ");
						placa = ler.next();

						System.out.println("Marca: ");
						marca = ler.next();

						System.out.println("Modelo: ");
						modelo = ler.next();

						System.out.println("Tipo: ");
						tipo = ler.next();

						System.out.println("Ano: ");
						ano = ler.nextInt();

						carro.ListaCarro(placa, marca, modelo, ano, tipo);
						carro.AddCarro(carro);

						break;

					case 2:
						for (Veiculos c : Veiculos.list) {

							if (c.getCategoria().equals("Carro")) {

								c.dadosVeiculos();

							}

							

						}
						
						break;

					}

				}

				break;

			case 2:
                
				cont2=0;
				while (cont2 != 3) {
					
					Moto moto = new Moto();
					
					System.out.println("::::::::::::MOTOS:::::::::::::::");
					System.out.println("Cadastrar(1) Listar(2) Voltar(3)");
					System.out.println(":::::::::::::::::::::::::::::::::");
					cont2 = ler.nextInt();
					
					switch (cont2) {

					case 1:

						System.out.println("Placa: ");
						placa = ler.next();

						System.out.println("Marca: ");
						marca = ler.next();

						System.out.println("Modelo: ");
						modelo = ler.next();

						System.out.println("Cilindradas: ");
						cilindradas = ler.nextInt();

						System.out.println("Ano: ");
						ano = ler.nextInt();

						moto.listaMoto(placa, ano, cilindradas, marca, modelo);
						moto.AddMoto(moto);

						break;

					case 2:
						for (Veiculos c : Veiculos.list) {

							if ("Moto".equals(c.getCategoria())) {

								c.dadosVeiculos();

							}

						}
						break;

					}

				}

				break;

			case 3:

				for (Veiculos c : Veiculos.list) {
					c.dadosVeiculos();
				}

				break;

			case 4:

				System.out.println("Encerrando sistema....");

				break;

			}

		}

	}

}
