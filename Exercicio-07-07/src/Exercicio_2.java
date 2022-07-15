import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		System.out.print("Escreva seu nome: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello World ");
		System.out.print(name);	
		
		sc.close();
	}

}
