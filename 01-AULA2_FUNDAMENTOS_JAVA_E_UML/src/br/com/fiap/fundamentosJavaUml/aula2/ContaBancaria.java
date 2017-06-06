package br.com.fiap.fundamentosJavaUml.aula2;

public class ContaBancaria {
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;

	private double taxaBancaria = 1;

	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}

	public void saque(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public double getTaxaBancaria() {
		return this.taxaBancaria;
	}

	public double getTaxaBancaria(int dias) {
		return this.taxaBancaria * dias;
	}

	public double getTaxaBancaria(int dias, int meses) {
		return (this.taxaBancaria * dias) + (this.taxaBancaria * (meses * 30));
	}

	@Override
	public String toString() {
		return "ContaBancaria [getSaldo()=" + getSaldo() + ", getNomeCliente()=" + getNomeCliente()
				+ ", getEndCliente()=" + getEndCliente() + ", getCpfCliente()=" + getCpfCliente() + "]";
	}
}
