package br.com.alura.microservice.fornecedor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByEstadoContainingIgnoreCase(String estado);

	List<Produto> findByIdIn(List<Long> idsDoProdutos);

}
