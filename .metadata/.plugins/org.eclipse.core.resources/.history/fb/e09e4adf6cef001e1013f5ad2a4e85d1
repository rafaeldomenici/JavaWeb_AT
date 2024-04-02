package br.edu.infnet.rafaeldomenici.model.domain;

public class Roupa {
	private int id;
	private String nome;
	private char tamanho;
	private float valor;
	private String genero;
	
	public Roupa() {
		
	}
	
	
	public Roupa(int id, String nome, char tamanho, float valor, String genero) {
		
		this.id = id;
		this.nome = nome;
		this.tamanho = tamanho;
		this.valor = valor;
		this.genero = genero;
	}


	public float valorComDesconto() {
		if(tamanho == 'G') {
			return this.valor*0.9f;
		}
		else if(tamanho == 'M') {
			return this.valor*0.95f;
		}
		else {
			return this.valor;
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getTamanho() {
		return tamanho;
	}


	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Roupa [id=" + id + ", nome=" + nome + ", tamanho=" + tamanho + ", valor=" + valor + ", genero="
				+ genero + "]";
	}
	
}
