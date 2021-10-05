package br.com.alura.microservice.loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alura.microservice.loja.dto.FornecedorDTO;
import br.com.alura.microservice.loja.dto.ItemDoPedidoDTO;
import br.com.alura.microservice.loja.dto.PedidoDeCompraDTO;

@FeignClient("ms-fornecedor")
public interface FornecedorClient {

	@RequestMapping("/api/fornecedor/dados/{estado}")
	FornecedorDTO obterFornecedorPorEstado(@PathVariable String estado);
	
	@RequestMapping(method=RequestMethod.POST, value="/api/fornecedor/pedido")
	PedidoDeCompraDTO realizarPedidoDeCompra(List<ItemDoPedidoDTO> itens);

}
