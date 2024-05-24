package entidades;

import entidades.enums.Color;

public class Retangulo extends Forma {

	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Color cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setlargura(Double largura) {
		this.largura = largura;
	}

	public Double getHeight() {
		return largura;
	}

	public void setHeight(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}