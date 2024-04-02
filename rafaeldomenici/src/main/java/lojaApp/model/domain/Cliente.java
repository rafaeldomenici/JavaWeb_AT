package lojaApp.model.domain;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	
	private String telefone;
	
	

	public Cliente(int id, String nome, Endereco endereco, ArrayList<Venda> listaVendas, String telefone) {
		super(id, nome, endereco, listaVendas);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + "]"+super.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
