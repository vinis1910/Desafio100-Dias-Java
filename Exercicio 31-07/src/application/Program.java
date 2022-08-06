package application;

import java.util.Scanner;

import model.services.Div;
import model.services.Mult;
import model.services.Soma;
import model.services.Sub;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Soma soma = new Soma();
		Sub sub = new Sub();
		Mult mult = new Mult();
		Div div = new Div();

		System.out.println("Coloque o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Coloque o valor de B: ");
		double b = sc.nextDouble();

		System.out.println(
				"Escolha a operação desejada:\n" + "1-Soma\n" + "2-Subtração\n" + "3-Multiplicação\n" + "4-Divisão\n");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			System.out.println("O resultado da sua soma é: " + soma.calcula(a, b));
			break;
		}
		case 2: {
			System.out.println("O resultado da sua Subtração é: " + sub.calcula(a, b));
			break;
		}
		case 3: {
			System.out.println("O resultado da sua Multiplicação é: " + mult.calcula(a, b));
			break;
		}
		case 4: {
			System.out.println("O resultado da sua Divisao é: " + div.calcula(a, b));
			break;
		}

		}
		sc.close();
	}
}
