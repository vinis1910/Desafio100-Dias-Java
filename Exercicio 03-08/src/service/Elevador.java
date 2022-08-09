package service;

public class Elevador {
	private int andarAtual = 0, totalAndares, capacidade, pessoasPresentes = 0;

	public Elevador(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	
	public void Entra(int numPessoasEntra) throws IllegalArgumentException {
		this.pessoasPresentes += numPessoasEntra;
		
		if(this.pessoasPresentes >= this.capacidade) {
			throw new IllegalArgumentException("Limite de pessoas atingido!!!");
		}
		
		System.out.println("O numero de pessoas no elevador é: " + this.pessoasPresentes );
	}
	
	public void Sai(int numPessoasSai) throws IllegalArgumentException {
		this.pessoasPresentes -= numPessoasSai;
		if(this.pessoasPresentes <= 0) {
			throw new IllegalArgumentException("Nao ha pessoas para retirar");
		}
		System.out.println("O numero de pessoas no elevador é: " + this.pessoasPresentes );
	}
	
	public void Subir(int andar) throws IllegalArgumentException {
		this.andarAtual += andar;
		if(this.andarAtual > this.totalAndares) {
			throw new IllegalArgumentException("Limites de andares excedido");
		}
		System.out.println("O andar atual é:  " + this.andarAtual );
	}
	
	public void Descer(int andar) throws IllegalArgumentException {
		this.andarAtual -= andar;
		if(this.andarAtual <= 0) {
			throw new IllegalArgumentException("Ja esta no terreo");
		}
		System.out.println("O andar atual é:  " + this.andarAtual );
	}
}
