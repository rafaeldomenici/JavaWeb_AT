package lojaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lojaApp.model.domain.Cliente;
import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.ItemEstoque;

public class ItemEstoqueService {
private static Map<Integer, ItemEstoque> itens = new HashMap<Integer, ItemEstoque>();
	
	private static Integer id = 0;
	
	public static void incluir(ItemEstoque itemEstoque) {
		
		itemEstoque.setId(++id);
		
		itens.put(itemEstoque.getId(), itemEstoque);
	}

	public static void excluir(Integer id) {
		itens.remove(id);
	}
	
	public static Collection<ItemEstoque> obterLista() {
		return itens.values();
	}
	
	public static ItemEstoque obterPorId(Integer id) {
		return itens.get(id);
	}
	
	public static void substituir(Integer id, ItemEstoque itemEstoque) {
		itens.replace(id, itemEstoque);
	}
}
