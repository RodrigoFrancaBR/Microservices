package br.com.alura.microservice.loja.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.loja.controller.dto.PedidoDTO;
import br.com.alura.microservice.loja.service.PedidoService;

@RestController
@RequestMapping("/api/loja/pedido")
public class PedidoController {

	private PedidoService service;

	public PedidoController(PedidoService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void realizarPedido(@RequestBody PedidoDTO pedido) {
		service.realizarPedido(pedido);
	}
}
