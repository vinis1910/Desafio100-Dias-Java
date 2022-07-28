package entities;

public class Fatura {
	private int numeroItem, qtdItem, precoUni;
	private String desc;
	
	public Fatura() {
	}
	
	public Fatura(int numeroItem, int qtdItem, int precoUni, String desc) {
		this.numeroItem = numeroItem;
		this.qtdItem = qtdItem;
		this.precoUni = precoUni;
		this.desc = desc;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public int getQtdItem() {
		if(qtdItem < 0) {
			return 0;
		}else {
			return qtdItem;
		}
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	public int getPrecoUni() {
		if(precoUni < 0) {
			return 0;
		}else {
			return precoUni;
		}
	}

	public void setPrecoUni(int precoUni) {
		this.precoUni = precoUni;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	public double calcular_valor_fatura(){
		return qtdItem * precoUni;
	}
	
	
}
