package entities;

public class Zoologico {
	
	public void jaulas() {
		Animal[] arr = {new Cachorro(), new Cavalo(), new Preguica(), new Cachorro(), new Cavalo(), new Preguica(), new Cachorro(), new Cavalo(), new Preguica(), new Cavalo()}; 
		for(Animal animal : arr) {

			System.out.print("Som do animal: ");
			animal.emitirSom();
			System.out.print("A��o do animal: ");
			animal.acao();
			System.out.println();
		}
		
	}
}
