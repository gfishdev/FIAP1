package br.com.fiap.persistenciaEmJava.aula1.roteiro1.aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.persistenciaEmJava.aula1.roteiro1.dao.DAOPedido;
import br.com.fiap.persistenciaEmJava.aula1.roteiro1.dao.DaoCliente;
import br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity.Cliente;
import br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity.Pedido;

public class CadastroClientes {

	public static void main(String[] args) {

		try {

			System.out.println("Cadastrando Cliente ...");

			DaoCliente clientes = new DaoCliente();
			DAOPedido pedidos = new DAOPedido();

			List<Pedido> pedidosCliente = new ArrayList<>();

			Cliente cliente = new Cliente("Jo�o", "j@jose.com", pedidosCliente);
			cliente = clientes.incluirCliente(cliente);

			pedidosCliente.add(new Pedido(cliente.getId(), new Date(), "Materiais Gerais", 2000));
			pedidosCliente.add(new Pedido(cliente.getId(), new Date(), "Materiais Papelaria", 4520));

			for (Pedido pedido : pedidosCliente) {
				pedido = pedidos.incluirPedido(pedido);
			}

			System.out.println("Cadastrando Cliente Finalizado!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}