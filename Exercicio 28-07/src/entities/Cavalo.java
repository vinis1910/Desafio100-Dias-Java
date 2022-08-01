package entities;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Som do cavalo");
	}
	
	@Override
	public void acao() {
		System.out.println("correndo");
	}
}
