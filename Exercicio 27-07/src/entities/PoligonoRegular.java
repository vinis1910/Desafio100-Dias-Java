package entities;

public class PoligonoRegular {
	private int numLados;
	private double tamLados;
	
	public PoligonoRegular() {
		
	}
	
	public PoligonoRegular(int numLados, double tamLados) {
		this.numLados = numLados;
		this.tamLados = tamLados;
	}
	
	public int getNumLados() {
		return numLados;
	}

	public double getTamLados() {
		return tamLados;
	}

	public double calcPerimetro() {
		return tamLados * numLados;
	}
	
	public double calcAngInterno() {
		return ((numLados - 2) * 180)/numLados;
	}
}
