import java.util.Scanner;
import java.util.ArrayList;
import entities.Pessoa;

public class Exe_19 {

	public static void main(String[] args) {
		int dia, mes, ano, idade, opcao;
		String nome;
		Scanner sc = new Scanner(System.in);
		Pessoa albertEinsten = new Pessoa();
		Pessoa isacNewton = new Pessoa();
		Pessoa outra = new Pessoa();
		
		System.out.println("Qual pessoa deseja saber a idade?");
		System.out.println("1 - Albert Einsten.\n"
							+ "2 - Isac Newton.\n"
							+ "3 - Outra Pessoa.\n"
							+ "4 - Sair");
		while(true) {
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			albertEinsten.calculaIdade(1879);
			albertEinsten.informaIdade("Albert Einsten");
		}else if(opcao == 2) {
			isacNewton.calculaIdade(1643);
			isacNewton.informaIdade("Isac Newton");
		}else if(opcao == 3) {
			System.out.println("Coloque o nome da pessoa: ");
			nome = sc.next();
			System.out.println("Coloque a data de nascimento de " + nome + ": ");
			System.out.println("Dia: ");
			dia = sc.nextInt();
			System.out.println("mes: ");
			mes = sc.nextInt();
			System.out.println("ano: ");
			ano = sc.nextInt();
			
			outra.calculaIdade(ano);
			outra.informaIdade(nome);
		}else if(opcao == 4) {
			break;
		}
	}
}

}
