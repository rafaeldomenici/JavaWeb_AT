package lojaApp.controller;

import java.util.Collection;

import com.google.gson.Gson;

import lojaApp.model.domain.Cliente;
import lojaApp.model.domain.Endereco;
import lojaApp.model.domain.Funcionario;
import lojaApp.model.service.ClienteService;
import lojaApp.model.service.EnderecoService;
import lojaApp.model.service.FuncionarioService;
import spark.Route;

public class FuncionarioController {
	
	public static Route obterLista = (req, res) -> {
		
		return FuncionarioService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		
		
		Funcionario funcionario = new Gson().fromJson(req.body(), Funcionario.class);
		
		FuncionarioService.incluir(funcionario);
		
		return "Inclusão realizada com sucesso: "+funcionario+"!";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Funcionario funcionario = FuncionarioService.obterPorId(index);		

		FuncionarioService.excluir(index);		
		
		return "Exclusão realizada com sucesso: "+funcionario+"!";
	};
	
	public static Route obter = (req, res) -> {
		
		
		Integer index = Integer.valueOf(req.params("id"));
				
				
		return FuncionarioService.obterPorId(index);
	};
	
	public static Route substituir = (req,res) -> {
		Funcionario funcionario = new Gson().fromJson(req.body(), Funcionario.class);
		Integer index = Integer.valueOf(req.params("id"));
		
		FuncionarioService.substituir(index, funcionario);
		return "Substituição realizada com sucesso";
	};
	
	public static Route exibirLista = (req, res) -> {
		Collection<Funcionario> funcionarios = FuncionarioService.obterLista();
    	String conteudo = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">";
    	conteudo += "<style>table { margin-top: 150px;}</style>";
    	
        conteudo += "<table class='table table-striped table-dark'>";
    	conteudo += "<tr> <th>Id</th> <th>Nome</th> <th>Endereco</th> <th>Salario</th> <th>Vendas</th></tr>";
    	for(Funcionario funcionario : funcionarios) {
    		conteudo += "<tr> <td>"+funcionario.getId()+"</td> <td>"+funcionario.getNome()+"</td> <td>"+funcionario.getEndereco()+"</td> <td>"+funcionario.getSalario()+"</td> <td>"+funcionario.getListaVendas()+"</td></tr>";
    	}
    	conteudo += "</table>";
    	return conteudo;
	};
}
