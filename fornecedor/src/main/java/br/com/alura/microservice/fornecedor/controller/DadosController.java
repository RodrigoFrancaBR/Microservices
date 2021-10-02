package br.com.alura.microservice.fornecedor.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.DadosDoFornecedor;
import br.com.alura.microservice.fornecedor.service.DadosService;

@RestController
@RequestMapping("/fornecedor/dados")
public class DadosController {
	
	
	private DadosService service;
	
	public DadosController(DadosService service) {
		this.service = service;
	}

	@RequestMapping("/{estado}")
	public DadosDoFornecedor obterDadosPorEstado(@PathVariable String estado) {
		return service.obterDadosPorEstado(estado);		
	}
}
