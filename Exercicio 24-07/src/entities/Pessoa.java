package entities;

import java.time.Year;
import java.util.Calendar;

public class Pessoa {
	public int dia, mes, ano, idade;
	public String nome;
	
	public void calculaIdade(int ano) {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int idade = anoAtual - ano;
				
		this.idade = idade;
	}
	
	public void informaIdade(String nome){
		System.out.println("A idade de " + nome + " é: " + this.idade);
	}

}
