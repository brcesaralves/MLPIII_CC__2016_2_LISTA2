package br.unipe.mlpIII.formageometrica.model;

public class Retangulo extends Quadrilatero implements IGeometria{
	
	public Retangulo(double base, double altura) {
		super(base, altura, 0, 0);
	}

	@Override
	public double calculoArea() {
		return 0;
	}

	@Override
	public double calculoPerimetro() {
		return this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4();
	}

	
	
}
