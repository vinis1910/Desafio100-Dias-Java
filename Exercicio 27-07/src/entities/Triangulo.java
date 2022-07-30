package entities;
public class Triangulo extends PoligonoRegular {

	private double tam;

	public Triangulo(int numLados, double tamLados, double tam) {
		super(numLados, tamLados);
		this.tam = tam;
	}


	public double calcArea(){
		return (Math.pow(tam, 2) * Math.sqrt(3))/4;
	}
	
	
}
