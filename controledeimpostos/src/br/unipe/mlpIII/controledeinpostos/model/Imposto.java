package br.unipe.mlpIII.controledeinpostos.model;


public class Imposto {
	
	private int codImposto;
	private double valorImposto;
	private int anoImposto;

	enum TpImposto{
		MUNICIPAL, ESTADUAL, FEDERAL;
	}

	
	public int getCodImposto() {
		return codImposto;
	}
	
	public void setCodImposto(int codImposto) {
		 this.codImposto = codImposto;
	}
	
	public double getValorImposto() {
		return valorImposto;
	}
	
	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}
	
	public int getAnoImposto() {
		return anoImposto;
	}
	
	public void setAnoImposto(int anoImposto) {
		this.anoImposto = anoImposto;
	}
	
}
