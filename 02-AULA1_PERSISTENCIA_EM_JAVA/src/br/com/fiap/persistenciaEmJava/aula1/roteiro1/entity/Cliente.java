package br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity;

import java.io.Serializable;
import java.util.List;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3164644916668303706L;
	private int id;
	private String nome;
	private String email;
	private List<Pedido> pedidos;

	public Cliente(String nome, String email, List<Pedido> pedidos) {
		super();
		this.nome = nome;
		this.email = email;
		this.pedidos = pedidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
