package entities;

public class Triangulo extends FiguraPlana {
	private double base, altura;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	

	public double getLado() {
		return base;
	}


	public double getAltura() {
		return altura;
	}


	@Override
	public double area() {
		return (base * altura)/2;
	}

	@Override
	public double perimetro() {
		return base * 3 ;
	}

	@Override
	public String toString() {
		return "Triangulo";
	}
}
