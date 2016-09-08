package br.unipe.mlpIII.formageometrica.model;

public class Circulo implements IGeometria{
	private double raio;
		
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculoArea() {
		return 3.14*(this.raio*this.raio);
	}

	@Override
	public double calculoPerimetro() {
		return (2*3.14)*this.raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
