package br.com.alura.microservice.loja.service;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.DadosDoFornecedorDTO;
import br.com.alura.microservice.loja.controller.dto.PedidoDTO;

@Service
public class PedidoService {

	public void realizarPedido(PedidoDTO pedido) {
		String estado = pedido.getEndereco().getEstado();
		String url = "http://localhost:8081/fornecedor/dados/" + estado; 
		RestTemplate client = new RestTemplate();
		ResponseEntity<DadosDoFornecedorDTO> response = client.exchange(url, HttpMethod.GET, null, DadosDoFornecedorDTO.class);
		System.out.println(response.getBody().getEndereco());
	}

}
