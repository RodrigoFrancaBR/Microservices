package br.com.alura.microservice.fornecedor.service;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.DadosDoFornecedor;
import br.com.alura.microservice.fornecedor.repository.DadosRepository;

@Service
public class DadosService {

	private DadosRepository repository;

	public DadosService(DadosRepository repository) {
		this.repository = repository;
	}

	public DadosDoFornecedor obterDadosPorEstado(String estado) {
		// return repository.findByEstado(estado);
		return repository.findByEstadoContainingIgnoreCase(estado);

	}
}
