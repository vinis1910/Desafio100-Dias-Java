package application;
import java.util.Scanner;
import entities.PoligonoRegular;
import entities.Quadrado;
import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual forma voce deseja ?\n"
				          + "1-Poligono regular?\n"
				          + "2-Triangulo?\n"
				          + "3-Quadrado?");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Coloque o numero de lados: ");
			int numLados = sc.nextInt();
			System.out.println("Coloque o tamanho dos lados: ");
			int tamLados = sc.nextInt();
			PoligonoRegular poligono = new PoligonoRegular(numLados, tamLados);
			System.out.println("O perimetro da sua forma �:" + poligono.calcPerimetro() + "\nE o angulo interno �: " + poligono.calcAngInterno()+"�");
		}else if(opcao == 2) {
			int numLados = 3;
			System.out.println("Coloque o tamanho dos lados: ");
			int tamLados = sc.nextInt();
			Triangulo triangulo = new Triangulo(numLados, tamLados, tamLados);
			System.out.println("O perimetro da sua forma �:" + triangulo.calcPerimetro() + "\nE o angulo interno �: " + triangulo.calcAngInterno() + "�\nE a area �: " + String.format("%.2f", triangulo.calcArea()));
		}else if(opcao == 3) {
			int numLados = 4;
			System.out.println("Coloque o tamanho dos lados: ");
			int tamLados = sc.nextInt();
			Quadrado quadrado = new Quadrado(numLados, tamLados, tamLados);
			System.out.println("O perimetro da sua forma �:" + quadrado.calcPerimetro() + "\nE o angulo interno �: " + quadrado.calcAngInterno() + "�\nE a area �: " + String.format("%.2f", quadrado.calcArea()));
		}else {
			System.out.println("Numero invalido!!!");
		}
		
		sc.close();

	}

}