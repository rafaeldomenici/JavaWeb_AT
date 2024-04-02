package lojaApp.model.domain;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
	
	private float salario;

	public Funcionario(int id, String nome, Endereco endereco, ArrayList<Venda> listaVendas, float salario) {
		super(id, nome, endereco, listaVendas);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + "]"+super.toString();
	}
	
	

	
	
	
	
}
