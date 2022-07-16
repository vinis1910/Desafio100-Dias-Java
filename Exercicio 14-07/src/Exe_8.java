import java.util.Scanner;

public class Exe_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coloque o numero de materias: ");
		int nmrMaterias = sc.nextInt();
		//nmrMaterias = linhas
		int bimestres = 4;
		//bimestres = colunas
		
		String[] materias = new String[nmrMaterias];
		double[][] notas = new double[nmrMaterias][bimestres];
		
		System.out.print("Coloque suas materias: ");
		for(int i = 0; i < nmrMaterias; i++) {
			materias[i] = sc.next();
		}
		

		for(int l = 0; l < nmrMaterias; l++) {
			System.out.println("Coloque suas notas");
			System.out.println(materias[l] + ":");
			for(int c = 0; c < bimestres; c++) {
				notas[l][c] = sc.nextDouble();
			}
		}
		
		for(int k = 0; k < nmrMaterias; k++) {
			System.out.print(materias[k] + " | ");
			for(int j = 0; j < bimestres; j++) {
				System.out.print(notas[k][j] + " | ");
			}
			System.out.printf("= %.1f", (notas[k][0] + notas[k][1] + notas[k][2] + notas[k][3])/4);
			System.out.print("\n");
		}
		
		sc.close();

	}
}
