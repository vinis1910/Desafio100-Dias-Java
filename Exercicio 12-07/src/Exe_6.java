import java.util.Scanner;

public class Exe_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque quanto eh a taxa de juros: ");
		double taxa = sc.nextDouble();
		System.out.println("Coloque o valor investido: ");
		double valor = sc.nextDouble();
		System.out.println("Com a taxa de juros em " + taxa + "%, " + "o valor duplicara em " + juros(taxa, valor) + " anos.");
		
		sc.close();
	}
	
	public static double juros(double taxa, double valor) {
		taxa = taxa / 100;
		double anos = 0;
		double count = valor * 2;
		while(valor < count) {
			double juros = valor * taxa;
			valor = valor + juros;
			anos = anos + 1;
		}
		return anos;
	}
}
