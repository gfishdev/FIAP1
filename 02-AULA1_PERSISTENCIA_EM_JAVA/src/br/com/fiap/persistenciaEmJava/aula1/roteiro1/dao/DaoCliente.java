package br.com.fiap.persistenciaEmJava.aula1.roteiro1.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity.Cliente;
import br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity.Pedido;

public class DaoCliente extends Dao {
	public Cliente incluirCliente(Cliente c) throws SQLException {
		abrirConexao();

		String sql = "INSERT INTO CLIENTES" + " (NOME, EMAIL) VALUES (?, ?)";

		ps = con.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getEmail());
		ps.execute();
		ps.close();

		sql = "SELECT LAST_INSERT_ID() AS ID";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();

		if (rs.next()) {
			c.setId(rs.getInt("ID"));
		}

		fecharConexao();

		return c;
	}

	public Cliente buscarCliente(int id) throws SQLException {
		Cliente cliente = null;
		List<Pedido> pedidos = new ArrayList<>();

		abrirConexao();

		String sql = "SELECT IDPEDIDO, DATA, DESCRICAO, VALOR FROM PEDIDOS WHERE IDCLIENTE = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();

		while (rs.next()) {
			Pedido pedido = new Pedido(id, rs.getDate("DATA"), rs.getString("DESCRICAO"), rs.getDouble("VALOR"));
			pedido.setId(rs.getInt("IDPEDIDO"));
			pedidos.add(pedido);
		}

		rs.close();
		ps.close();

		sql = "SELECT NOME, EMAIL FROM CLIENTES WHER ID = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if (rs.first()) {
			cliente = new Cliente(rs.getString("NOME"), rs.getString("EMAIL"), pedidos);
			cliente.setId(id);
		}

		rs.close();
		ps.close();

		fecharConexao();

		return cliente;
	}
}