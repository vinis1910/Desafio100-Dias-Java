package model.services;

public class Soma implements OperacaoMatematica {
	
	@Override
	public double calcula(Double a, Double b) {
		return a + b;
		
	}

}
