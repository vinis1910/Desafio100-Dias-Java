import java.util.Scanner;

public class Exe_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		
		System.out.println("Coloque os 10 numeros: ");
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
			arrayB[i] = arrayA[i];
			
			if(arrayA[i] % 2 == 0) {
				arrayB[i] = arrayA[i] * 5;
			}else {
				arrayB[i] = arrayA[i] + 5;
			}
		}
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayB[i] + " - ");
		}
		
		sc.close();
	}

}
