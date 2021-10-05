package br.com.alura.microservice.fornecedor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.dto.ItemDoPedidoDTO;
import br.com.alura.microservice.fornecedor.model.Pedido;
import br.com.alura.microservice.fornecedor.service.PedidoService;

@RestController
@RequestMapping("api/fornecedor/pedido")
public class PedidoController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

	private PedidoService service;

	public PedidoController(PedidoService service) {
		this.service = service;
	}
    
	// certo é devolver um pedidoDTO
	@RequestMapping(method = RequestMethod.POST)
	public Pedido realizarPedido(@RequestBody List<ItemDoPedidoDTO> itens) {
		LOG.info("Pedido recebido {}", itens);
		return service.realizarPedido(itens);
	}

	// certo é devolver um pedidoDTO	
	@RequestMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		return service.obterPedidoPorId(id);
	}
}
