package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.DadosDoFornecedor;

@Repository
public interface DadosRepository extends JpaRepository<DadosDoFornecedor, Long> {
	
	public DadosDoFornecedor findByEstado(String estado);
	
	public DadosDoFornecedor findByEstadoContainingIgnoreCase(String estado);

}
