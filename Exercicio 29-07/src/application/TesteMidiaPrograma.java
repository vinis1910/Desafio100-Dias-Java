package application;

import java.util.Scanner;

import entities.CD;
import entities.DVD;
import entities.Midia;

public class TesteMidiaPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Midia m1 = new CD();
		Midia m2 =  new DVD();
		
		System.out.print("Coloque o tipo da midia (CD/DVD): ");
		String opcao = sc.next();
		
		if(opcao.toLowerCase().equals("cd")) {
			m1.inserirDados();
			m1.printDados();
		}else {
			m2.inserirDados();
			m2.printDados();
		}
		
		sc.close();
	}

}
