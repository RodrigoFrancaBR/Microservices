package br.com.alura.microservice.fornecedor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.Fornecedor;
import br.com.alura.microservice.fornecedor.service.FornecedorService;

@RestController
@RequestMapping("api/fornecedor/dados")
public class FornecedorController {
	
	private static final Logger LOG = LoggerFactory.getLogger(FornecedorController.class);
	
	
	private FornecedorService service;
	
	public FornecedorController(FornecedorService service) {
		this.service = service;
	}

	@RequestMapping("/{estado}")
	public Fornecedor obterDadosPorEstado(@PathVariable String estado) {
		LOG.info("Recebido pedido de dados do fornecedor de {}", estado);
		return service.obterDadosPorEstado(estado);		
	}
}
