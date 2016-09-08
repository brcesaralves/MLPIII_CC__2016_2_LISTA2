package br.unipe.mlpIII.formageometrica.ui;

import java.util.LinkedList;

import br.unipe.mlpIII.formageometrica.model.Circulo;
import br.unipe.mlpIII.formageometrica.model.IGeometria;
import br.unipe.mlpIII.formageometrica.model.Quadrado;
import br.unipe.mlpIII.formageometrica.model.Retangulo;
import br.unipe.mlpIII.formageometrica.util.Util;

public class Principal {
	
	public static void main(String[] args) {
		
		IGeometria quadrilatero;
		Circulo circulo;
		
		LinkedList<IGeometria> listaDeFormas = new LinkedList<>();
		
		Util util = new Util();
		int qtd = 0;
		
		System.out.println("Digite o numero de formas que deseja criar:");
		qtd = Integer.parseInt(util.ler());
		
		for(int i=0; i<qtd; i++){
			
			switch (util.Menu()) {
				case 1:
					System.out.println("Digite o Lado do Quadrado:");
					quadrilatero = new Quadrado(Double.parseDouble(util.ler()));
					listaDeFormas.add(quadrilatero);
					
					quadrilatero.calculoArea();
					break;
					
				case 2:
					System.out.println("Digite a Base e a Altura do Retângulo:");
					quadrilatero = new Retangulo(Double.parseDouble(util.ler()), Double.parseDouble(util.ler()));
					listaDeFormas.add(quadrilatero);
					
					break;
					
				case 3:
					System.out.println("Digite o Raio do Circulo:");
					circulo = new Circulo(Double.parseDouble(util.ler()));
					listaDeFormas.add(circulo);
					
					break;	
	
				default:
					break;
			}
			
		}
		
		for(int i=1; i<=qtd; i++){
			System.out.println("###  FORMA " + i + ": " + listaDeFormas.get(i-1).getClass().getSimpleName() + "  ###\n"
					+ "Área: " + listaDeFormas.get(i-1).calculoArea() + "\n"
					+ "Perimetro: " + listaDeFormas.get(i-1).calculoPerimetro() + "\n" );
		}
		
	}

}