package entities;

public class Quadrado extends PoligonoRegular {
	private double tam;
	

	public Quadrado(int numLados, double tamLados, double tam) {
		super(numLados, tamLados);
		this.tam = tam;
	}


	public double calcArea() {
		return tam * tam;
	}
}
