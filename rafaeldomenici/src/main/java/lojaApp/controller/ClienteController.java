package lojaApp.controller;

import java.util.Collection;

import com.google.gson.Gson;

import lojaApp.model.domain.Cliente;
import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.Venda;
import lojaApp.model.service.ClienteService;
import lojaApp.model.service.EnderecoService;
import lojaApp.model.service.VendaService;
import spark.Route;

public class ClienteController {
	
	public static Route obterLista = (req, res) -> {
		
		return ClienteService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		
		
		Cliente cliente = new Gson().fromJson(req.body(), Cliente.class);
		
		ClienteService.incluir(cliente);
		
		return "Inclusão realizada com sucesso: "+cliente+"!";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Cliente cliente = ClienteService.obterPorId(index);		

		ClienteService.excluir(index);		
		
		return "Exclusão realizada com sucesso: "+cliente+"!";
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
				
				
		return ClienteService.obterPorId(index);
	};
	
	public static Route substituir = (req,res) -> {
		Cliente cliente = new Gson().fromJson(req.body(), Cliente.class);
		Integer index = Integer.valueOf(req.params("id"));
		
		ClienteService.substituir(index, cliente);
		return "Substituição realizada com sucesso";
	};
	
	public static Route exibirLista = (req, res) -> {
		Collection<Cliente> clientes = ClienteService.obterLista();
    	String conteudo = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">";
    	conteudo += "<style>table { margin-top: 150px;}</style>";
    	
        conteudo += "<table class='table table-striped table-dark'>";
    	conteudo += "<tr> <th>Id</th> <th>Nome</th> <th>Endereco</th> <th>Telefone</th> <th>Vendas</th></tr>";
    	for(Cliente cliente : clientes) {
    		conteudo += "<tr> <td>"+cliente.getId()+"</td> <td>"+cliente.getNome()+"</td> <td>"+cliente.getEndereco()+"</td> <td>"+cliente.getTelefone()+"</td> <td>"+cliente.getListaVendas()+"</td></tr>";
    	}
    	conteudo += "</table>";
    	return conteudo;
	};
}
