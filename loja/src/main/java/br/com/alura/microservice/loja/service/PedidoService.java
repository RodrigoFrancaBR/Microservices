package br.com.alura.microservice.loja.service;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.PedidoDTO;

@Service
public class PedidoService {

	public void realizarPedido(PedidoDTO pedido) {
		String path = pedido.getEndereco().getEstado();
		String url = "localhost:8081/fornecedor/dados/" + path; 
		RestTemplate client = new RestTemplate();
		// DadosFornecedorDTO
		ResponseEntity<String> response = client.exchange(url, HttpMethod.GET, null, String.class);
		System.out.println(response.getBody());
	}

}
