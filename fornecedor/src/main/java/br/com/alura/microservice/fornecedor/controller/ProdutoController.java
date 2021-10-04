package br.com.alura.microservice.fornecedor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.service.ProdutoService;

@RestController
@RequestMapping("api/fornecedor/produtos")
public class ProdutoController {

	private ProdutoService service;

	public ProdutoController(ProdutoService service) {
		this.service = service;
	}

	@RequestMapping("/{estado}")
	public List<Produto> obterProdutosPorEstado(@PathVariable String estado) {
		return service.obterProdutosPorEstado(estado);
	}
}
