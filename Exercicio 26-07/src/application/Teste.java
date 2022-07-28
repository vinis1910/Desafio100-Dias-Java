package application;

import entities.Fatura;

public class Teste {

	public static void main(String[] args) {

		Fatura testeFatura = new Fatura();
		
		testeFatura.setNumeroItem(414);
		testeFatura.setDesc("Intel I7 10700F");
		testeFatura.setPrecoUni(1999);
		testeFatura.setQtdItem(3);
		double total = testeFatura.calcular_valor_fatura();
		System.out.println("Voce tem " + testeFatura.getQtdItem() + " itens no carrinho.\n"
							+ "O valor total sera de: " + total);
	}

}
