package entidades;

import entidades.enums.Color;

public abstract class Forma {
    
    private Color cor;

    public Forma() {
	}
	
	public Forma(Color cor) {
		this.cor = cor;
	}

	public Color getColor() {
		return cor;
	}

	public void setColor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();

    
}
