package application;

import java.util.Scanner;

import service.Elevador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Elevador elevador = new Elevador(21, 10);
		
		try{
		while(true) {
			System.out.println("1-Entrar\n"
								+ "2-Sair\n"
								+ "3-Subir\n"
								+ "4-Descer\n"
								+ "5-Finalizar programa");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Coloque o numero de pessoas que irao entrar: ");
				int entrar = sc.nextInt();
				elevador.Entra(entrar);
			}else if(opcao == 2) {
				System.out.println("Coloque o numero de pessoas que irao sair: ");
				int sair = sc.nextInt();
				elevador.Sai(sair);;;
			}else if(opcao == 3) {
				System.out.println("Coloque quantos andares deseja subir: ");
				int subir = sc.nextInt();
				elevador.Subir(subir);
			}else if(opcao == 4) {
				System.out.println("Coloque quantos andares deseja descer: ");
				int descer = sc.nextInt();
				elevador.Descer(descer);
			}else if(opcao == 5) {
				break;
			}
			}
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro:" + e.getMessage());
		}
		
		sc.close();
	}

}
