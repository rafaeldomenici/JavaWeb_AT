package br.edu.infnet.rafaeldomenici.model.domain;

import java.util.ArrayList;

public class Venda {
	private int codVenda;
	private String formaPagamento;
	private ArrayList<Roupa> listaRoupas = new ArrayList<Roupa>();
	
	public Venda() {
		
	}
	
	
	public Venda(int codVenda, String formaPagamento, ArrayList<Roupa> listaRoupas) {
		super();
		this.codVenda = codVenda;
		this.formaPagamento = formaPagamento;
		this.listaRoupas = listaRoupas;
	}




	public float calcularValorVenda() {
		float soma = 0;
		
		for(Roupa r : listaRoupas) {
			soma += r.valorComDesconto();
		}
		return soma;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public ArrayList<Roupa> getListaRoupas() {
		return listaRoupas;
	}

	public void setListaRoupas(ArrayList<Roupa> listaRoupas) {
		this.listaRoupas = listaRoupas;
	}
	
	public void adicionarRoupa(Roupa roupa) {
		this.listaRoupas.add(roupa);
	}


	@Override
	public String toString() {
		return "Venda [codVenda=" + codVenda + ", formaPagamento=" + formaPagamento + ", listaRoupas=" + listaRoupas
				+ "]";
	}
	
	
	
}


