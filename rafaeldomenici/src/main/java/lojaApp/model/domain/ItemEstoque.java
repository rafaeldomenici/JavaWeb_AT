package lojaApp.model.domain;

public class ItemEstoque {
	private int id;
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
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "ItemEstoque [id=" + id + ", quantidade=" + quantidade + ", roupa=" + roupa + "]";
	}
	
	

	
	
	
}
