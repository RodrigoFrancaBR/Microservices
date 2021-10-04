package br.com.alura.microservice.fornecedor.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.Fornecedor;
import br.com.alura.microservice.fornecedor.service.FornecedorService;

@RestController
@RequestMapping("api/fornecedor/dados")
public class FornecedorController {
	
	
	private FornecedorService service;
	
	public FornecedorController(FornecedorService service) {
		this.service = service;
	}

	@RequestMapping("/{estado}")
	public Fornecedor obterDadosPorEstado(@PathVariable String estado) {
		return service.obterDadosPorEstado(estado);		
	}
}
