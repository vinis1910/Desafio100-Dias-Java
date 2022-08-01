package entities;

import java.util.Scanner;

public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	
	public Midia() {
		
	}
	
	public Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		String tipo = "Tipo da midia";
		return tipo;
	}
	
	public String getDetalhes() {
		String detalhes = "Codigo da Midia: " + this.codigo + "\nNome da midia: " + this.nome + "\nPreço da midia: " + this.preco;
		return detalhes;
	}
	
	public void printDados() {
		System.out.println("O tipo da midia é " + getTipo()
							+ "Detalhes da midia: \n" + getDetalhes());
	}
	
	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coloque o nome da musica/faixa: ");
		nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Coloque o codigo da midia: ");
		codigo = sc.nextInt();
		System.out.print("Preço do CD/DVD: ");
		preco = sc.nextFloat();
		sc.close();
	}
	
}
