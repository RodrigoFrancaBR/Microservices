package br.com.alura.microservice.loja.service;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.DadosDoFornecedorDTO;
import br.com.alura.microservice.loja.controller.dto.PedidoDTO;

@Service
public class PedidoService {
	
	private RestTemplate client;	
	private DiscoveryClient eurekaClient;
	
	public PedidoService(RestTemplate client, DiscoveryClient eurekaClient) {		
		this.client = client;
		this.eurekaClient = eurekaClient;
	}
	
	public void realizarPedido(PedidoDTO pedido) {
		
		String estado = pedido.getEndereco().getEstado();
		String url = "http://ms-fornecedor/api/fornecedor/dados/" + estado;
		
		ResponseEntity<DadosDoFornecedorDTO> response = client.exchange(url, HttpMethod.GET, null, DadosDoFornecedorDTO.class);
		
		eurekaClient.getInstances("ms-fornecedor").stream().forEach(f->{
			System.out.println("http://localhost: " + f.getPort());
		});
		
		System.out.println(response.getBody().getEndereco());
				
	}

}
