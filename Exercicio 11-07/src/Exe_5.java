import java.util.Scanner;

public class Exe_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja montar:");
		int tabuada = sc.nextInt();
		System.out.print("Comeca de: ");
		int inicio = sc.nextInt();
		System.out.print("E acaba em: ");
		int acaba = sc.nextInt();
		
		for(int i = inicio; i <= acaba; i++) {
			int resul = tabuada * i;
			System.out.println(tabuada + " X " + i + "=" + resul);
		}
		
		sc.close();

	}

}
