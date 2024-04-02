package br.edu.infnet.rafaeldomenici.model.domain;

public class ItemEstoque {
	private int quantidade;
	private Roupa roupa;
	
	
	public ItemEstoque() {
		
	}
	
	public ItemEstoque(int quantidade, Roupa roupa) {
		super();
		this.quantidade = quantidade;
		this.roupa = roupa;
	}

	public float calcularTotalItem() {
		return quantidade*roupa.valorComDesconto();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Roupa getRoupa() {
		return roupa;
	}

	public void setRoupa(Roupa roupa) {
		this.roupa = roupa;
	}

	@Override
	public String toString() {
		return "ItemEstoque [quantidade=" + quantidade + ", roupa=" + roupa + "]";
	}
	
	
}
