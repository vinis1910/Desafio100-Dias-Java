package application;

public class TesteException {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fim main");

	}
	
	static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("Inicio do metodo 2");
		try {
			int[] array = new int[10];
			for(int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: Tamanho de array insuficiente");
		}
		System.out.println("Fim do metodo2");
	}
}
