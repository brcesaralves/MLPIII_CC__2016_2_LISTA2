package br.unipe.mlpIII.formageometrica.ui;

import br.unipe.mlpIII.formageometrica.model.IGeometria;
import br.unipe.mlpIII.formageometrica.model.Quadrado;
import br.unipe.mlpIII.formageometrica.util.Util;

public class Principal {
	
	public static void main(String[] args) {
		
		IGeometria formaGeometrica;
		Util util = new Util();
		boolean flag = true;
		
		do{
			
			switch (util.Menu()) {
			case 1:
				formaGeometrica = new Quadrado(0);
				formaGeometrica.calculoArea();
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;


			default:
				break;
			}
			
		}while(flag);
		
	}

}
