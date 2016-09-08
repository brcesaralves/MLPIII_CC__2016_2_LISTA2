package br.unipe.mlpIII.formageometrica.util;

import java.util.Scanner;

public class Util {
	
	private int opcao;
	private Scanner leitor = new Scanner(System.in);
	
	public int Menu(){
		
		System.out.println("Digite sua Opção:");
		System.out.println("");
		System.out.println("1 - Criar Quadrado");
		System.out.println("2 - Criar Retângulo");
		System.out.println("3 - Criar Círculo");
		
		this.opcao = Integer.parseInt(ler());
				
		return opcao;
	}
	
	public String ler(){
		return leitor.next();
	}

}
