package entities;

import java.util.Scanner;

public class DVD extends Midia {
	int nFaixas;

	public DVD() {
		
	}
	
	public DVD(int codigo, double preco, String nome, int nFaixas) {
		super(codigo, preco, nome);
		this.nFaixas = nFaixas;
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	@Override
	public String getTipo() {
		String tipo = "DVD";
		return tipo;
	}
	
	@Override
	public String getDetalhes() {
		String detalhes = "Codigo do DVD: " + super.getCodigo() + "\nNome do DVD: " + super.getNome() + "\nPreço do DVD: " + super.getPreco();
		return detalhes;
	}
	
	@Override
	public void printDados() {
		System.out.println("O tipo da midia é " + getTipo()
							+ "\nDetalhes do DVD: \n" + getDetalhes());
	}
	
	@Override
	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coloque o nome da faixa: ");
		setNome(sc.nextLine());
		System.out.println("Coloque o codigo do DVD: ");
		setCodigo(sc.nextInt());
		System.out.print("Preço do DVD: ");
		setPreco(sc.nextDouble());
		System.out.println();
		sc.close();
	}
}
