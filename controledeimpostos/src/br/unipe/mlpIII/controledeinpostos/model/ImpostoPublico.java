package br.unipe.mlpIII.controledeinpostos.model;

public class ImpostoPublico extends Imposto implements ITributavel{
	
	public void calculaImposto(){
		
		double totalImposto = (this.getValorImposto()*0.15);
		
		System.out.println("Valor do Imposto P�blico: R$ " + totalImposto);
	}

	@Override
	public String toString() {
		return "Imposto P�blico:\nC�digo do Imposto: " + getCodImposto() + "\nValor Base: R$ " + getValorImposto()
				+ "\nAno Base: " + getAnoImposto();
	}
	
}
