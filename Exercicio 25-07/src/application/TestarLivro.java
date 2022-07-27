package application;

import entities.Livro;

public class TestarLivro {

	public static void main(String[] args) {
		
		Livro livroFavorito = new Livro();
		livroFavorito.setTitulo("O pequeno principe");
		livroFavorito.setQtdPaginas(98);
		
		System.out.println("O livro " + livroFavorito.getTitulo() + " possui " + livroFavorito.getQtdPaginas()+ " paginas");
		
		livroFavorito.setPaginasLidas(20);
		livroFavorito.verificarProgresso();
		livroFavorito.setPaginasLidas(50);
		livroFavorito.verificarProgresso();
		
	}

}
