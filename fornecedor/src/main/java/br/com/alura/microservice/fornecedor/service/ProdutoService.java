package br.com.alura.microservice.fornecedor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository repository;

	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}

	public List<Produto> obterProdutosPorEstado(String estado) {
		return this.repository.findByEstadoContainingIgnoreCase(estado);
	}

}
