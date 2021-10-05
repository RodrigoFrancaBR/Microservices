package br.com.alura.microservice.loja.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.loja.dto.PedidoDeVendaDTO;
import br.com.alura.microservice.loja.dto.VendaDTO;
import br.com.alura.microservice.loja.service.PedidoService;

@RestController
@RequestMapping("/api/loja/pedido")
public class PedidoController {

	private PedidoService service;

	public PedidoController(PedidoService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	public VendaDTO realizarPedido(@RequestBody PedidoDeVendaDTO pedido) {
		return service.realizarPedido(pedido);
	}
}
