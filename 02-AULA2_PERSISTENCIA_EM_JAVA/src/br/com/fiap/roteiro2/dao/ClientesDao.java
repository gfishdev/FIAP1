package br.com.fiap.roteiro2.dao;

import br.com.fiap.roteiro2.entity.Clientes;

public interface ClientesDao {
	Clientes inserirCliente(Clientes cliente) throws Exception;
	Clientes buscarCliente(int id) throws Exception;
}