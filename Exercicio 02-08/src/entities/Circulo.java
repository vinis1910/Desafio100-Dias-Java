package entities;

public class Circulo extends FiguraPlana {
	private double raio;

	public Circulo() {
		
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public String toString() {
		return "Circulo";
	}
}
