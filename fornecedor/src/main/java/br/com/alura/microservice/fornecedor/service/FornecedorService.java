package br.com.alura.microservice.fornecedor.service;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.Fornecedor;
import br.com.alura.microservice.fornecedor.repository.FornecedorRepository;

@Service
public class FornecedorService {

	private FornecedorRepository repository;

	public FornecedorService(FornecedorRepository repository) {
		this.repository = repository;
	}

	public Fornecedor obterDadosPorEstado(String estado) {
		return repository.findByEstadoContainingIgnoreCase(estado);

	}
}
