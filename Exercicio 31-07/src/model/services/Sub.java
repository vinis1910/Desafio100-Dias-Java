package model.services;

public class Sub implements OperacaoMatematica {

	@Override
	public double calcula(Double a, Double b) {
		return a - b;
		
	}

}
