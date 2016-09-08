package br.unipe.mlpIII.controledeimpostos.ui;

import br.unipe.mlpIII.controledeimpostos.util.Util;
import br.unipe.mlpIII.controledeinpostos.model.ImpostoDeRenda;
import br.unipe.mlpIII.controledeinpostos.model.ImpostoPrivado;
import br.unipe.mlpIII.controledeinpostos.model.ImpostoPublico;

public class Principal {
	
	public static void main(String[] args) {
		
		ImpostoDeRenda impostoRenda = new ImpostoDeRenda();
		ImpostoPrivado impostoPrivado = new ImpostoPrivado();
		ImpostoPublico impostoPublico = new ImpostoPublico();
		Util util = new Util();
		
		boolean flag = true;
		
		do{
			switch (util.Menu()) {
				case 1:
					impostoRenda.setCodImposto(123); //Cadastra o codigo do imposto
					System.out.println("Digite o valor: ");
					impostoRenda.setValorImposto(Double.parseDouble(util.ler())); //Cadastra o valor para calculo do imposto
					System.out.println("Digite o ano: ");
					impostoRenda.setAnoImposto(Integer.parseInt(util.ler())); //Cadastra o ano do imposto
					
					System.out.println(impostoRenda.toString());
					impostoRenda.calculaImposto();
					
					break;
					
				case 2:
					impostoPrivado.setCodImposto(456); //Cadastra o codigo do imposto
					System.out.println("Digite o valor: ");
					impostoPrivado.setValorImposto(Double.parseDouble(util.ler())); //Cadastra o valor para calculo do imposto
					System.out.println("Digite o ano: ");
					impostoPrivado.setAnoImposto(Integer.parseInt(util.ler())); //Cadastra o ano do imposto
					
					System.out.println(impostoPrivado.toString());
					impostoPrivado.calculaImposto();
					
					break;
							
				case 3:
					impostoPublico.setCodImposto(789); //Cadastra o codigo do imposto
					System.out.println("Digite o valor: ");
					impostoPublico.setValorImposto(Double.parseDouble(util.ler())); //Cadastra o valor para calculo do imposto
					System.out.println("Digite o ano: ");
					impostoPublico.setAnoImposto(Integer.parseInt(util.ler())); //Cadastra o ano do imposto
					
					System.out.println(impostoPublico.toString());
					impostoPublico.calculaImposto();
					
					break;
					
				case 4:
					//sair do sistema
					flag = false;
					break;
	
				default:
					System.out.println("Opção Inválida!");
					break;
				
			}//Fim do switch
		
		}while(flag);
		
	}//Fim do Main
	
}//Fim da Classe
