package entities;

import java.util.Scanner;

public class CD extends Midia {
	int nMusicas;

	public CD() {
		
	}
	
	public CD(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		this.nMusicas = nMusicas;
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	
	@Override
	public String getTipo() {
		String tipo = "CD";
		return tipo;
	}
	
	@Override
	public String getDetalhes() {
		String detalhes = "Codigo do CD: " + super.getCodigo() + "\nNome do CD: " + super.getNome() + "\nPreço do CD: " + super.getPreco();
		return detalhes;
	}
	
	@Override
	public void printDados() {
		System.out.println("O tipo da midia é " + getTipo()
							+ "\nDetalhes do CD: \n" + getDetalhes());

	}
	
	@Override
	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coloque o nome da musica: ");
		setNome(sc.nextLine());
		System.out.println("Coloque o codigo do CD: ");
		setCodigo(sc.nextInt());
		System.out.print("Preço do CD: ");
		setPreco(sc.nextDouble());
		System.out.println();
		sc.close();
	}
	
}
