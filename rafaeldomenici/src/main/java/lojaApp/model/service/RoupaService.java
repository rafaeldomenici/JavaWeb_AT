package lojaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.Roupa;

public class RoupaService {
	private static Map<Integer, Roupa> roupas = new HashMap<Integer, Roupa>();
	
	private static Integer id = 0;
	
	public static void incluir(Roupa roupa) {
		
		roupa.setId(++id);
		
		roupas.put(roupa.getId(), roupa);
	}

	public static void excluir(Integer id) {
		roupas.remove(id);
	}
	
	public static Collection<Roupa> obterLista() {
		return roupas.values();
	}
	
	public static Roupa obterPorId(Integer id) {
		return roupas.get(id);
	}
	
	public static void substituir(Integer id, Roupa roupa) {
		roupas.replace(id, roupa);
	}
}
