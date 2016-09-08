package br.unipe.mlpIII.controledeinpostos.model;

public class ImpostoDeRenda extends Imposto implements ITributavel{
	
	public void calculaImposto(){
		
		double totalImposto = (this.getValorImposto()*0.27);
		
		System.out.println("Valor do Imposto de Renda: R$ " + totalImposto);
	}

	@Override
	public String toString() {
		return "Imposto de Renda:\nCódigo do Imposto: " + getCodImposto() + "\nValor Base: R$ " + getValorImposto()
				+ "\nAno Base: " + getAnoImposto();
	}
		
}
