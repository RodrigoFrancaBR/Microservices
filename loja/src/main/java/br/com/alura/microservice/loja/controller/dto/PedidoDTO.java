package br.com.alura.microservice.loja.controller.dto;

import java.util.List;

public class PedidoDTO {

	private List<ItemDoPedidoDTO> listaDeItens;

	private EnderecoDTO endereco;

	public List<ItemDoPedidoDTO> getListaDeItens() {
		return listaDeItens;
	}

	public void setListaDeItens(List<ItemDoPedidoDTO> listaDeItens) {
		this.listaDeItens = listaDeItens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "PedidoDTO [listaDeItens=" + listaDeItens + ", endereco=" + endereco + "]";
	}

}
