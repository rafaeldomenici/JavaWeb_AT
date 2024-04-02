package lojaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lojaApp.model.domain.Endereco;

public class EnderecoService {
	private static Map<Integer, Endereco> enderecos = new HashMap<Integer, Endereco>();
	
	private static Integer id = 0;
	
	public static void incluir(Endereco endereco) {
		
		endereco.setId(++id);
		
		enderecos.put(endereco.getId(), endereco);
	}

	public static void excluir(Integer id) {
		enderecos.remove(id);
	}
	
	public static Collection<Endereco> obterLista() {
		return enderecos.values();
	}
	
	public static Endereco obterPorId(Integer id) {
		return enderecos.get(id);
	}
	
	public static void substituir(Integer id, Endereco endereco) {
		enderecos.replace(id, endereco);
	}
}
