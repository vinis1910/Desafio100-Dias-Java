
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coloque o tamanho do lado: ");
		double s = sc.nextDouble();	
		double resul = (6 * Math.pow(s, 2))/(4*Math.tan(Math.PI/6));
		System.out.printf("O resultado da area do hexagono eh: %.2f", resul );
		sc.close();
	}

}

