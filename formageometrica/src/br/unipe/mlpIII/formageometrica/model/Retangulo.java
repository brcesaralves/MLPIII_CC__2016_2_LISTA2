package br.unipe.mlpIII.formageometrica.model;

public class Retangulo extends Quadrilatero implements IGeometria{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super(base, altura, 0, 0);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculoArea() {
		return this.getLado1() * this.getLado2();
	}

	@Override
	public double calculoPerimetro() {
		return (this.getLado1()*2) + (this.getLado2()*2);
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
	
}
