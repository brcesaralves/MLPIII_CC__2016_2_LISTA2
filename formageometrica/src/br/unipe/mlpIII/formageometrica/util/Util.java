package br.unipe.mlpIII.formageometrica.util;

import java.util.Scanner;

public class Util {
	
	private int opcao;
	private Scanner leitor = new Scanner(System.in);
	
	public int Menu(){
		
		System.out.println("Digite sua Op��o:");
		System.out.println("");
		System.out.println("1 - Criar Quadrado");
		System.out.println("2 - Criar Ret�ngulo");
		System.out.println("3 - Criar C�rculo");
		
		this.opcao = Integer.parseInt(ler());
				
		return opcao;
	}
	
	public String ler(){
		return leitor.next();
	}

}
