package br.com.fiap.persistenciaEmJava.aula1.roteiro1.entity;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3151734121977470895L;
	private int id;
	private int idCliente;
	private Date data;
	private String descricao;
	private double valor;

	public Pedido(int idCliente, Date data, String descricao, double valor) {
		super();
		this.idCliente = idCliente;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
