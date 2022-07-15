import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha o primeiro numero: ");
		double num1 = sc.nextDouble();
		System.out.print("Escolha o segundo numero: ");
		double num2 = sc.nextDouble();
		System.out.print("Escolha um operador: ");
		String operador = sc.next();
		
		if(operador.equals("+")) {
			System.out.printf("O resultado da soma eh: %.2f ", num1 + num2);
		}else if(operador.equals("-")) {
			System.out.printf("O resultado da subtracao eh: %.2f ", num1 - num2);
		}else if(operador.equals("*")) {
			System.out.printf("O resultado da multiplicacao eh: %.2f ", num1 * num2);
		}else if(operador.equals("/")) {
			System.out.printf("O resultado da divisao eh: %.2f ", num1 / num2);
		}else {
			System.out.print("Operador ainda nao implementado");
		}
		
		sc.close();

	}

}
