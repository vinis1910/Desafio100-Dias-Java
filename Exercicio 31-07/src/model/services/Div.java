package model.services;

public class Div implements OperacaoMatematica {

	@Override
	public double calcula(Double a, Double b) {
		return a / b;
		
	}

}
