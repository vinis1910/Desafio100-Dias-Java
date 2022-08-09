package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Circulo;
import entities.FiguraPlana;
import entities.Losango;
import entities.Quadrado;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadrado: ");
		System.out.println("Coloque o valor do lado e da altura: ");
		double lado = sc.nextDouble();
		double altura = sc.nextDouble();
		System.out.println();
		System.out.println("Triangulo: ");
		System.out.println("Coloque o valor da base e da altura: ");
		double baseTrian = sc.nextDouble();
		double alturaTrian = sc.nextDouble();
		System.out.println();
		System.out.println("Losango: ");
		System.out.println("Coloque o valor do lado e da altura: ");
		double ladoLosa = sc.nextDouble();
		double alturaLosa = sc.nextDouble();
		System.out.println();
		System.out.println("Circulo: ");
		System.out.println("Coloque o valor do raio");
		double raio = sc.nextDouble();
		
		
		ArrayList<FiguraPlana> figuras = new ArrayList<>();
		figuras.add(new Quadrado(lado, altura));
		figuras.add(new Triangulo(baseTrian, alturaTrian));
		figuras.add(new Losango(ladoLosa, alturaLosa));
		figuras.add(new Circulo(raio));
		
		for(FiguraPlana figura : figuras) {
			System.out.println("A area da figura " +figura.toString() + " é " + figura.area());
			System.out.println("O perimetro da figura " + figura.toString() + " é " + figura.perimetro());
			System.out.println();
		}
		
		sc.close();

	}

}
