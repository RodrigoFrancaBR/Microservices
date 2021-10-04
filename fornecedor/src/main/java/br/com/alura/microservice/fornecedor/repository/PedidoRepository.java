package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {	

}
