package entities;

public class Quadrado extends FiguraPlana {
	private double lado, altura;
	
	public Quadrado() {
		
	}
	
	public Quadrado(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double area() {
		return lado * altura;
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}
	
	@Override
	public String toString() {
		return "Quadrado";
	}

}
