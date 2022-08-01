package entities;

public class Cachorro extends Animal {

	
	@Override
	public void emitirSom() {
		System.out.println("Som do cachorro");
	}
	
	@Override
	public void acao() {
		System.out.println("correndo");
	}
}
