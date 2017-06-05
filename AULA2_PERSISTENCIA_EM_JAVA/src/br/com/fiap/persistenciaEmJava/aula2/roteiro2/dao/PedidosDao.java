package br.com.fiap.persistenciaEmJava.aula2.roteiro2.dao;

import java.util.List;

import br.com.fiap.persistenciaEmJava.aula2.roteiro2.entity.Pedidos;

public interface PedidosDao {
	Pedidos incluirPedido(Pedidos pedido) throws Exception;
	List<Pedidos> listarPedidos(int idCliente) throws Exception;
}