package br.com.alura.microservice.loja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.loja.client.FornecedorClient;
import br.com.alura.microservice.loja.dto.FornecedorDTO;
import br.com.alura.microservice.loja.dto.ItemDoPedidoDTO;
import br.com.alura.microservice.loja.dto.PedidoDeCompraDTO;
import br.com.alura.microservice.loja.dto.PedidoDeVendaDTO;
import br.com.alura.microservice.loja.dto.VendaDTO;

@Service
public class PedidoService {
	
	private FornecedorClient client;		
	
	public PedidoService(FornecedorClient client) {		
		this.client = client;		
	}
	
	public VendaDTO realizarPedido(PedidoDeVendaDTO pedido) {
		
		String estado = pedido.getEndereco().getEstado();
		
		List<ItemDoPedidoDTO> itens = pedido.getItens();
	
		FornecedorDTO fornecedor = client.obterFornecedorPorEstado(estado);
		
		System.out.println(fornecedor.getEndereco());
		
		PedidoDeCompraDTO pedidoDeCompra = client.realizarPedidoDeCompra(itens);
		
		return new VendaDTO(pedidoDeCompra.getId(), pedidoDeCompra.getTempoDePreparo(), pedido.getEndereco().toString());
						
				
	}

}
