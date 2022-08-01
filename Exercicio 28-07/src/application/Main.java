package application;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;
import entities.Veterinario;
import entities.Zoologico;

public class Main {

	public static void main(String[] args) {
		
		Animal a1 = new Cachorro();
		Animal a2 = new Cavalo();
		Animal a3 = new Preguica();
		Veterinario veterinario = new Veterinario();
		Zoologico zoologico = new Zoologico();
		
		veterinario.examinar(a1);
		veterinario.examinar(a2);
		veterinario.examinar(a3);
		
		System.out.println("------------------");
		zoologico.jaulas();
		
	}

}
