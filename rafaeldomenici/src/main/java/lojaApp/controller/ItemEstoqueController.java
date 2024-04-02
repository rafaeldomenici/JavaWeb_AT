package lojaApp.controller;

import java.util.Collection;

import com.google.gson.Gson;

import lojaApp.model.domain.Cliente;
import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.ItemEstoque;
import lojaApp.model.domain.Roupa;
import lojaApp.model.service.ClienteService;
import lojaApp.model.service.EnderecoService;
import lojaApp.model.service.ItemEstoqueService;
import lojaApp.model.service.RoupaService;
import spark.Route;

public class ItemEstoqueController {
	public static Route obterLista = (req, res) -> {
		
		return ItemEstoqueService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		
		
		ItemEstoque itemEstoque = new Gson().fromJson(req.body(), ItemEstoque.class);
		
		ItemEstoqueService.incluir(itemEstoque);
		
		return "Inclusão realizada com sucesso: "+itemEstoque+"!";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		ItemEstoque itemEstoque = ItemEstoqueService.obterPorId(index);		

		ItemEstoqueService.excluir(index);		
		
		return "Exclusão realizada com sucesso: "+itemEstoque+"!";
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
				
				
		return ItemEstoqueService.obterPorId(index);
	};
	
	public static Route substituir = (req,res) -> {
		ItemEstoque itemEstoque = new Gson().fromJson(req.body(), ItemEstoque.class);
		Integer index = Integer.valueOf(req.params("id"));
		
		ItemEstoqueService.substituir(index, itemEstoque);
		return "Substituição realizada com sucesso";
	};
	
	public static Route exibirLista = (req, res) -> {
		Collection<ItemEstoque> itens = ItemEstoqueService.obterLista();
    	String conteudo = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">";
    	conteudo += "<style>table { margin-top: 150px;}</style>";
    	
        conteudo += "<table class='table table-striped table-dark'>";
    	conteudo += "<tr> <th>Id</th> <th>Nome</th> <th>Tamanho</th> <th>Valor</th> <th>Gênero</th> <th>Quantidade</th></tr>";
    	for(ItemEstoque item : itens) {
    		conteudo += "<tr> <td>"+item.getRoupa().getId()+"</td> <td>"+item.getRoupa().getNome()+"</td> <td>"+item.getRoupa().getTamanho()+"</td> <td>"+item.getRoupa().getValor()+"</td> <td>"+item.getRoupa().getGenero()+"</td> <td>"+item.getQuantidade()+"</td> </tr>";
    	}
    	conteudo += "</table>";
    	return conteudo;
	};
}
