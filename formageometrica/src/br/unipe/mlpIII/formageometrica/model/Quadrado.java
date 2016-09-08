package br.unipe.mlpIII.formageometrica.model;

public class Quadrado extends Quadrilatero implements IGeometria{
	
	public Quadrado(double lado) {
		super(lado, 0, 0, 0);
	}

	@Override
	public double calculoArea() {
		return this.getLado1()*this.getLado1();
	}

	@Override
	public double calculoPerimetro() {
		return this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4();
	}

	
	
}
