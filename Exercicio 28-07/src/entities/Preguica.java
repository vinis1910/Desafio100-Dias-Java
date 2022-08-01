package entities;

public class Preguica extends Animal {
	
	@Override
	public void emitirSom() {
		System.out.println("Som da preguiça");
	}
	
	@Override
	public void acao() {
		System.out.println("Subindo em arvore");
	}
}
