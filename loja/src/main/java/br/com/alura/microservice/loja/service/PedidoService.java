package br.com.alura.microservice.loja.service;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.loja.client.FornecedorClient;
import br.com.alura.microservice.loja.dto.DadosDoFornecedorDTO;
import br.com.alura.microservice.loja.dto.PedidoDTO;

@Service
public class PedidoService {
	
	private FornecedorClient client;		
	
	public PedidoService(FornecedorClient client) {		
		this.client = client;		
	}
	
	public void realizarPedido(PedidoDTO pedido) {
		
		String estado = pedido.getEndereco().getEstado();
	
		DadosDoFornecedorDTO response = client.obterDadosPorEstado(estado);
				
		System.out.println(response.getEndereco());
				
	}

}
