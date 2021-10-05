package br.com.alura.microservice.loja.dto;

import java.util.List;

public class PedidoDeVendaDTO {

	private List<ItemDoPedidoDTO> itens;

	private EnderecoDTO endereco;

	public List<ItemDoPedidoDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedidoDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	

}
