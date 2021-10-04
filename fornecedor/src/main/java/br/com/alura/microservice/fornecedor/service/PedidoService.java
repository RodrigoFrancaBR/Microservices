package br.com.alura.microservice.fornecedor.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.dto.ItemDoPedidoDTO;
import br.com.alura.microservice.fornecedor.model.ItemDoPedido;
import br.com.alura.microservice.fornecedor.model.Pedido;
import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.repository.PedidoRepository;
import br.com.alura.microservice.fornecedor.repository.ProdutoRepository;

@Service
public class PedidoService {

	private PedidoRepository pedidoRepository;
	private ProdutoRepository produtoRepository;

	public PedidoService(PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
		this.pedidoRepository = pedidoRepository;
		this.produtoRepository = produtoRepository;
	}

	public Pedido realizarPedido(List<ItemDoPedidoDTO> itens) {

		if (itens == null) {
			return null;
		}

		List<ItemDoPedido> pedidoItens = toPedidoItem(itens);
		Pedido pedido = new Pedido(pedidoItens);
		pedido.setTempoDePreparo(itens.size());
		return pedidoRepository.save(pedido);

	}

	private List<ItemDoPedido> toPedidoItem(List<ItemDoPedidoDTO> itens) {

		List<Long> idsDoProdutos = itens.stream().map(item -> item.getId()).collect(Collectors.toList());

		List<Produto> produtosDoPedido = produtoRepository.findByIdIn(idsDoProdutos);

		List<ItemDoPedido> itensDoPedido = itens.stream().map(item -> {
			Produto produto = produtosDoPedido.stream().filter(p -> p.getId() == item.getId()).findFirst().get();

			ItemDoPedido itenDoPedido = new ItemDoPedido();
			itenDoPedido.setProduto(produto);
			itenDoPedido.setQuantidade(item.getQuantidade());
			return itenDoPedido;
		}).collect(Collectors.toList());
		return itensDoPedido;
	}

	public Pedido obterPedidoPorId(Long id) {
		return this.pedidoRepository.findById(id).orElse(new Pedido());
	}

}
