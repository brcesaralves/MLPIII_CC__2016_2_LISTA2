package br.unipe.mlpIII.controledeinpostos.model;

public class ImpostoPrivado extends Imposto implements ITributavel{
	
	public void calculaImposto(){
		
		double totalImposto = (this.getValorImposto()*0.1);
		
		System.out.println("Valor do Imposto Privado: R$ " + totalImposto);
	}

	@Override
	public String toString() {
		return "Imposto Privado:\nCódigo do Imposto: " + getCodImposto() + "\nValor Base: R$ " + getValorImposto()
				+ "\nAno Base: " + getAnoImposto();
	}
	
}
