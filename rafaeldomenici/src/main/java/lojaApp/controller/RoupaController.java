package lojaApp.controller;

import java.util.Collection;

import com.google.gson.Gson;

import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.Roupa;
import lojaApp.model.domain.Venda;
import lojaApp.model.service.EnderecoService;
import lojaApp.model.service.RoupaService;

import spark.Route;

public class RoupaController {
	
	public static Route obterLista = (req, res) -> {
		
		return RoupaService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		
		
		Roupa roupa = new Gson().fromJson(req.body(), Roupa.class);
		
		RoupaService.incluir(roupa);
		
		return "Inclusão realizada com sucesso: "+roupa+"!";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Roupa roupa = RoupaService.obterPorId(index);		

		RoupaService.excluir(index);		
		
		return "Exclusão realizada com sucesso: "+roupa+"!";
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
				
				
		return RoupaService.obterPorId(index);
	};
	
	public static Route substituir = (req,res) -> {
		Roupa roupa = new Gson().fromJson(req.body(), Roupa.class);
		Integer index = Integer.valueOf(req.params("id"));
		
		RoupaService.substituir(index, roupa);
		return "Substituição realizada com sucesso";
	};
	
	public static Route exibirLista = (req, res) -> {
		Collection<Roupa> roupas = RoupaService.obterLista();
    	String conteudo = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">";
    	conteudo += "<style>table { margin-top: 150px;}</style>";
    	
        conteudo += "<table class='table table-striped table-dark'>";
    	conteudo += "<tr> <th>Id</th> <th>Nome</th> <th>Tamanho</th> <th>Valor</th> <th>Gênero</th> </tr>";
    	for(Roupa roupa : roupas) {
    		conteudo += "<tr> <td>"+roupa.getId()+"</td> <td>"+roupa.getNome()+"</td> <td>"+roupa.getTamanho()+"</td> <td>"+roupa.getValor()+"</td> <td>"+roupa.getGenero()+" </td> </tr>";
    	}
    	conteudo += "</table>";
    	return conteudo;
	};
}
