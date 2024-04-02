package lojaApp.controller;

import java.util.Collection;

import com.google.gson.Gson;

import lojaApp.model.domain.Endereco;
import lojaApp.model.service.EnderecoService;
import spark.Route;

public class EnderecoController {
	public static Route obterLista = (req, res) -> {
		
		return EnderecoService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		
		
		Endereco endereco = new Gson().fromJson(req.body(), Endereco.class);
		
		EnderecoService.incluir(endereco);
		
		return "Inclusão realizada com sucesso: "+endereco+"!";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Endereco endereco = EnderecoService.obterPorId(index);		

		EnderecoService.excluir(index);		
		
		return "Exclusão realizada com sucesso: "+endereco+"!";
	};
	
	public static Route obter = (req, res) -> {
		
		
		Integer index = Integer.valueOf(req.params("id"));
				
				
		return EnderecoService.obterPorId(index);
	};
	
	public static Route substituir = (req,res) -> {
		Endereco endereco = new Gson().fromJson(req.body(), Endereco.class);
		Integer index = Integer.valueOf(req.params("id"));
		
		EnderecoService.substituir(index, endereco);
		return "Substituição realizada com sucesso";
	};
		
	public static Route exibirLista = (req, res) -> {
		Collection<Endereco> enderecos = EnderecoService.obterLista();
    	String conteudo = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">";
    	conteudo += "<style>table { margin-top: 150px;}</style>";
    	
        conteudo += "<table class='table table-striped table-dark'>";
    	conteudo += "<tr> <th>Id</th> <th>Cep</th> <th>Logradouro</th> <th>Complemento</th> <th>Bairro</th> <th>Localidade</th> <th>uf</th></tr>";
    	for(Endereco endereco : enderecos) {
    		conteudo += "<tr> <td>"+endereco.getId()+"</td> <td>"+endereco.getCep()+"</td> <td>"+endereco.getLogradouro()+"</td> <td>"+endereco.getComplemento()+"</td> <td>"+endereco.getBairro()+" </td> <td>"+endereco.getLocalidade()+"</td> <td>"+endereco.getUf()+"</td></tr>";
    	}
    	conteudo += "</table>";
    	return conteudo;
	};
}