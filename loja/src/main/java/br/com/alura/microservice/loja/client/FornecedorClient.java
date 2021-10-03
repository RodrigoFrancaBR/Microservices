package br.com.alura.microservice.loja.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.microservice.loja.dto.DadosDoFornecedorDTO;

@FeignClient("ms-fornecedor")
public interface FornecedorClient {

	@RequestMapping("/api/fornecedor/dados/{estado}")
	DadosDoFornecedorDTO obterDadosPorEstado(@PathVariable String estado);

}
