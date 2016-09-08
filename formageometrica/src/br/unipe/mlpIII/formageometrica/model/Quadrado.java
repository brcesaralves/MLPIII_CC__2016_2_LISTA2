package br.unipe.mlpIII.formageometrica.model;

public class Quadrado extends Quadrilatero implements IGeometria{
	private double lado;
	
	public Quadrado(double lado) {
		super(lado, 0, 0, 0);
		this.lado = lado;
	}

	@Override
	public double calculoArea() {
		return this.getLado1()*this.getLado1();
	}

	@Override
	public double calculoPerimetro() {
		return this.getLado1() * 4;
	}

	public double getLado() {
		return lado;
	}
	
}
