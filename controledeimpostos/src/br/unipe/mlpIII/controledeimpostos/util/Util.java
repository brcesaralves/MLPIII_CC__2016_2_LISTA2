package br.unipe.mlpIII.controledeimpostos.util;

import java.util.Scanner;


public class Util {
	
	private int opcao;
	private Scanner leitor = new Scanner(System.in);
	
	public int Menu(){
		
		System.out.println("====================================");
		System.out.println("        CONTROLE DE IMPOSTOS        ");
		System.out.println("====================================");
		System.out.println("");
		System.out.println("Digite sua Opção:");
		System.out.println("");
		System.out.println("1 - Calcular Imposto de Renda");
		System.out.println("2 - Calcular Imposto Privado");
		System.out.println("3 - Calcular Imposto Público");
		System.out.println("4 - Sair");
		
		this.opcao = Integer.parseInt(ler());
				
		return opcao;
	}
	
	public String ler(){
		return leitor.next();
	}

}
